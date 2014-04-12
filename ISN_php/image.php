<?php
//librairie GD activée
header ("Content-type: image/png");
$image = imagecreate(200,50);
$orange = imagecolorallocate($image, 255, 128, 0);
$bleu = imagecolorallocate($image, 0, 0, 255);
imagestring($image, 2, 10, 10, "salut toto", $bleu);
imagepng($image);
imagedestroy($image);
?>
