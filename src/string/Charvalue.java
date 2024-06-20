package string;

public class Charvalue {
 String name;
 public Charvalue(String charvalue) {
     this.name=charvalue;
 }
public char nthchar(int n) {
   return this.name.charAt(n);
}

}
