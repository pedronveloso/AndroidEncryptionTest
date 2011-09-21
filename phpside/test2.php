<?php

$cipher = "rijndael-128"; 
 $mode = "cbc"; 
 $secret_key = "androidptrules"; 
 //iv length should be 16 bytes 
 $iv = "fedcba9876543210"; 

 // Make sure the key length should be 16 bytes 
 $key_len = strlen($secret_key); 
 if($key_len < 16 ){ 
 $addS = 16 - $key_len; 
 for($i =0 ;$i < $addS; $i++){ 
 $secret_key.=" "; 
 } 
 }else{ 
 $secret_key = substr($secret_key, 0, 16); 
 } 

 $td = mcrypt_module_open($cipher, "", $mode, $iv); 
 mcrypt_generic_init($td, $secret_key, $iv); 
 $cyper_text = mcrypt_generic($td, "isto é uma frase com acentuação"); 
 mcrypt_generic_deinit($td); 
 mcrypt_module_close($td); 
 echo bin2hex($cyper_text); 

 ?> 
