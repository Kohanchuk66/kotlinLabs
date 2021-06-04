import kotlin.math.*
//val scan: Scanner = java.util.Scanner(System.`in`)

fun main(){
//    1 task
//    var numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5, 11, 121, 77, 48, 36, 12, 98, 234, 345678, 65, 55, 87, 66, 0, 88);
//    numbers.sortDescending();
//    for (i in numbers){
//        if (i % 11 == 0 && i != 0){
//            println(i);
//        }
//    }

//    2 task
//    println("Введіть кількість чисел");
//    var n = scan.nextInt();
//
//    fun nsk(a: Int, b: Int, d: Int): Int {
//        if (a==0||b==0)
//            return d/(b+a);
//        else
//        {
//            if (a>=b)
//                return nsk(a%b,b,d);
//            else{
//                return nsk(a,b%a,d);
//            }
//        }
//    }
//
//    var k = 1;
//    println("Введіть числa");
//    for (i in 1..n){
//        var a = scan.nextInt();
//        k = nsk(k, a, a * k);
//    }
//    print(k);


//    3 task

    var str = readLine()!!;
    var splitStr = str.split('.');
    splitStr.forEach{println(it)};
    for (i in 0..splitStr.size - 2){
        println(splitStr[i].split(" ").size);
    }
}