package com.example.kotlindersleri.nesne_tabanli_programlama

class odev2 {
    fun soru1(km:Double):Double{
        return km*0.623


    }

    fun soru2(kenar:Int): Int{

        return (kenar-2)*180
    }

    fun soru3(gün:Int):Int{
        var saat=gün*8
        var ücret=saat*40
        if (150 < saat){
          var ekücret=  (saat-150)*80
            ücret=ücret+ekücret}
        return ücret

    }
    fun soru4(süre:Int):Int
    {
       if  (1 < süre){
         return  50+10*(süre-1)

       }
        else
            return 50
    }

    fun soru5(kenar1:Double,kenar2: Double):Double{
    return kenar1*kenar2}

    fun soru6(sayi:Int):Int{
        var result=1
        for (i in sayi downTo 1){
            result=result*i }
        return result

}
    fun soru7(kelime:String):Int{
        var counter = 0
        for (c in kelime) {
            if (c == 'e') {
                counter++
            }
        }
        return counter




}
}
