#/usr/bin/env python3
# -*- coding: utf-8 -*-
#
#  pythonUsbTest.py
#  
#  Permet de d'écrire sur port parallele à partir d'une connexion usb.
#
#  Copyright 2014 yves Mercadier <yves.mercadier@ac-montpellier.fr>
#  

#specifications
#parametre : 
#	
#retour : 
#	
import sys
import usb.core
import usb.util

def testDevice():
	# find USB devices
	dev = usb.core.find(find_all=True)
	# loop through devices, printing vendor and product ids in decimal and hex
	i=0
	for cfg in dev:
	#sys.stdout.write('Decimal VendorID=' + str(cfg.idVendor) + ' & ProductID=' + str(cfg.idProduct) + '\n')
		sys.stdout.write(str(i)+':Hexadecimal VendorID=' + hex(cfg.idVendor) + ' & ProductID=' + hex(cfg.idProduct) + '\n\n')
		i=i+1

def module():
	# find our device
	dev = usb.core.find(idVendor=0x9710, idProduct=0x7715)
	# was it found?
	if dev is None:
		sys.stdout.write('Device not found')
        
        
	# configuration will be the active one
	dev.set_configuration()
	# get an endpoint instance
	cfg = dev.get_active_configuration()
	intf = cfg[(0,0)]
	ep = usb.util.find_descriptor(intf,
    # match the first OUT endpoint
    custom_match = \
    lambda e: \
        usb.util.endpoint_direction(e.bEndpointAddress) == \
        usb.util.ENDPOINT_OUT)
	assert ep is not None
	# write the data
	ep.write(1,'test')

print ("   ---> Debut du programme.\n")
#testDevice()
module()
print ("\n   ---> Fin du programme.")
