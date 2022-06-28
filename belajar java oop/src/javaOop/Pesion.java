package javaOop;
class Pesion {
String Name;
String Adress;
final String contry = "Indonesia";
Pesion(String ParamName, String ParamAdress){
 Name = ParamName;
 Adress = ParamAdress;
}
Pesion(String ParamName){
 Name = ParamName;
}
Pesion(){
 
}
void sayHello(String ParamName){
    System.out.println("Hello"+ParamName+", My Name Is :"+Name);   
}
}
