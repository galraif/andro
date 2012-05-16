<?php

require "Sweets.php";

class Liquorice extends Sweets {
    
    public static $price = 0.80;
    public static $name = "Sweet, Sweet Liquorice";
    
    public static function getPrice($amount = 1) {
        return (self::$price * $amount);
    }
    
};

echo Liquorice::getPrice(10);