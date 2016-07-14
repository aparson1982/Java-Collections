public class Collection<Obj>  //Collection Class <Generic Class Obj>
{
    
    public int size;
    public Obj[] things;  
        
    public Collection()  //constructs array 
    {
        things = (Obj[]) new Object[12];  //sets array size to 12
        
    }
    
    public Collection(int maxSize)  
    {
        things = (Obj[]) new Object[maxSize];  //sets parameter and creates array with that max size
    }
     
    public void insert(Obj x)  //inserts object into array
    {
        if(size >= things.length)  //checks if array has reached its max size
        {
            System.out.println("Error:  Array is at capacity.");
        }
        things[size] = x;
        size++;  //increment through array
    }
    
    public void remove(Obj x)  //removes objects from array
    {
        if(isEmpty())  //checks if the array is empty
        {
            System.out.println("Error:  Array is empty.");
        }
        
        boolean detect = false;
        
        for(int i = 0; i < size; i++)  //iterate through array to find the object to remove
        {
            if(things[i].equals(x))  //checks if given object is equal to the current object in the array
            {
                detect = true;
                for(int j = i; j < size-1; j++)  //moves objects
                {
                    things[j] = things[j+1];
                }
                things[size-1] = null;
                size--;
            }
   
        }
    }
    
     public void makeEmpty()  //removes the array of ojects
    {
        size = 0;
    }
    
    public boolean isEmpty()  //confirms that the array is empty
    {
        return (size == 0);
    }
    
     public int size()  //gets the size of the array
    {
        return size;
    }
    
    public boolean isPresent(Obj x)  //checks to make sure that the object is in the array
    {
        for(int i=0; i<size; i++)
        {
            if(things[i].equals(x))
            return true;
        }
        return false;
    }
             
    public String get()  //gets the object and parses it to a String
    {
        String getIt = "";
        for(int i = 0; i<size; i++)  //iterates through array
        {
            getIt += "\t" + things[i].toString();
        }
        
        return getIt;
        
    }
}