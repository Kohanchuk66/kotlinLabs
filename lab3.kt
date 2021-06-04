import kotlin.math.*
val scan = java.util.Scanner(System.`in`)

fun main(){
//    1 task
//    var a = scan.nextDouble();
//    var b = scan.nextDouble();
//    var c = scan.nextDouble();
//
//    if(a == b && b != c || b == c && a != b || a == c && a != b){
//        println("Рівнобедренний");
//    }
//    else{
//        println("Не рівнобедренний");
//    }

//    2 task
//    println("Введіть кількість чисел");
//    var a = scan.nextInt();
//    var k = 0;
//    for (i in 1..a) {
//        a = scan.nextInt();
//        if ((a/10).toInt() < 10 && (a/10).toInt() != 0){
//            k++;
//        }
//    }
//    println(k);

//    3 task
    for (i in 10..99) {
        if (i % 9 == 0){
            println(i);
            continue;
        }
        if (i % 10 == 9 || (i/10).toInt() == 9){
            println(i);
        }
    }
}