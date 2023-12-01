import java.util.Scanner; 

class App {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int selection; 

    System.out.println("What is your favourite capital city in Canada: \n[1] Vancouver \n[2] Edmonton \n[3] Regina \n[4] Winnipeg \n[5] Ottawa \n[6] Quebec \n[7] Iqaluit \n[8] Whitehorse \n[9] Yellowknife \n[10] Charlottetown \n[11] Halifax \n[12] Fredericton \n[13] St. John\'s ");
    selection = kb.nextInt();
    
    switch(selection){
      case 1: 
        System.out.println("The household income  in Vancouver is $79,422 while the average household is $704,000");
        break;
      case 2: 
        System.out.println("Did you know that Edmonton is home to the largest indoor roller coaster in the world?!");
        break;
      case 3:
        System.out.println("The original name for Regina was pile of bones");
        break;
      case 4: 
        System.out.println("Winnipeg is the first city in the world to create the 911 emergency line.");
        break;
      case 5:
        System.out.println("Ottawa is the capital of Canada");
        break;
      case 6:
        System.out.println("Quebec used section 33 of the charter AKA the notwithstanding clause to create a law in which any signs / posters in Quebec could NOT have any english writing on it.");
        break;
      case 7:
        System.out.println("Iqaluit has the smallest population out of all the other capitals");
        break;
      case 8: 
        System.out.println("Named after the white horse rapids.");
        break;
      case 9: 
        System.out.println("Called the Diamond Capital of North America");
        break;
      case 10: 
        System.out.println("Cradle for Canadian Confederation, founding fathers met here in 1864");
        break;
      case 11: 
        System.out.println("One of the largest, deepest ice-free natural harbours in the world.");
        break;
      case 12: 
        System.out.println("Home to the longest covered bridge.");
        break;
      case 13: 
        System.out.println("Oldest city in North America");
        break;
    }
  }
}