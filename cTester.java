public class cTester  //tester class for collection
{
    public static void main(String[] args)  //main method
    {
        Collection collection = new Collection();  //uses conctructor from collection class to create object

        //add objects to array
        collection.insert("Alpha");
        collection.insert("Bravo");
        collection.insert("Charlie");
        collection.insert("Delta");
        collection.insert("Echo");
        collection.insert("Foxtrot");
        collection.insert("Golf");
        collection.insert("Hotel");
        collection.insert("India");
        collection.insert("Juliet");
        collection.insert("Kilo");
        collection.insert("Lima");
       
       
        System.out.println("Showing the array of objects by testing collection.get method:  ");
        System.out.println(collection.get());  //shows objects in arrray
        System.out.println("        Amount of objects in collection:  " + collection.size());  //shows how many objects are in the array
        System.out.println("");
        System.out.println("");
        System.out.println("Now to test some objects in the collection...");
        System.out.println("We will test Delta, Kilo, and Juliet.");
        System.out.println("        Checking for Delta in collection...  " + collection.isPresent("Delta"));  //checks if object is present in array
        System.out.println("        Checking if Kilo in collection...  " + collection.isPresent("Kilo"));
        System.out.println("        Checking if Juliet is in the array...  " + collection.isPresent("Juliet"));
        System.out.println("");
        System.out.println("");
        System.out.println("Now to test the collection.remove method we will remove Delta, Kilo, and Juliet.");
        System.out.println("        Removing Delta, Kilo, Juliet, and Beavis... ");
        collection.remove("Delta");
        collection.remove("Kilo");
        collection.remove("Juliet");
        System.out.println("        Array after removal of objects:  " + collection.get());  //shows array of objects that have been modified
        System.out.println("        Size of array is now:  " + collection.size());  //shows how many objects are in there after change was made
        System.out.println("");
        System.out.println("");
        System.out.println("Now to test if the array is empty.");
        System.out.println("        Checking if array is empty...  " + collection.isEmpty());  //checks if array is empty
        System.out.println("");
        System.out.println("");
        System.out.println("Now to make the array empty.");
        System.out.println("        Making array empty...");
        collection.makeEmpty();
        System.out.println("        Testing if array is empty..."+ collection.isEmpty()); //makes array empty
        System.out.println("        Size of array after emptying array:  " + collection.size());  //shows size after making array empty
        
                
    }
}