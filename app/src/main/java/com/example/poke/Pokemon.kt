package com.example.poke

import java.util.Date

data class Beer(
    var abv_gt:Int,
    var abv_lt:Int,
    var ibu_gt:Int,
    var ibu_lt:Int,
    var ebc_gt:Int,
    var ebc_it:Int,
    var beer_name:String,
    var yeast:String,
    var brewed_before:Date,
    var brewed_after:Date,
    var hops:String,
    var malt:String,
    var food:String,
    var ids:String
)
