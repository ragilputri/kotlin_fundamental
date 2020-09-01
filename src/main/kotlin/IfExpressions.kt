fun main(){
    val NilaiA=80;
    val hasilA: String;
    hasilA=if (NilaiA >= 75)  {
      ", selamat ya!"
    }
    else {
        ", silakan ikut remedial"
    }
    println("Nilai kamu "+ NilaiA + hasilA)

    val NilaiB=60;
    val hasilB: String;
    hasilB=if (NilaiB >= 75)  {
        ", selamat ya!"
    }
    else {
        ", silakan ikut remedial"
    }
    println("Nilai kamu "+ NilaiB + hasilB)
}