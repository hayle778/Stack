import java.util.Stack;

public class Games {
public static void main(String[]args) {

    Stack<String> games = new Stack<String>();

    games.add("Call of Duity");
    games.add("Guitar Hero");
    games.add("Super Monkey ball");


// to get the first stack use pop
    System.out.println( games.pop());
   System.out.println( games.pop());
   System.out.println( games.pop());
  //  System.out.println( games.pop() );



Stack<Character>tower = new Stack<Character>();
tower.add( 'r' );
tower.add( 'b' );
tower.add( 'y' );

System.out.println(tower.pop());
System.out.println(tower.contains( 'p'));
System.out.println( tower.get(0));
System.out.println( tower.size());
}
}
