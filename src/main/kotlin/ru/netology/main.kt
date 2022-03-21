package ru.netology

fun main() {
    val amount = 20000_00
    val discountStart = 1001_00
    val discountStandart = 100_00
    val discountStart2 = 10001_00
    val discountPerc = 0.05
    val isMeloman = true
    val discountMeloman = 0.01

    var totalDiscount = 0
    if ((amount >= discountStart) && (amount < discountStart2)) {
        totalDiscount += discountStandart;
    }
    if (amount >= discountStart2) {
        totalDiscount = (amount * discountPerc).toInt()
    }
    if (isMeloman == true) {
        totalDiscount += ((amount - totalDiscount) * discountMeloman).toInt()
    }
    println("Скидка: " + totalDiscount / 100 + " руб. " + totalDiscount % 100 + " коп.")
}
