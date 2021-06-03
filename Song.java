class Song
{
    protected String title;
    protected int duration;
    protected String author;
    protected int size;
    
    Song(String t, int d, String a, int s)
    {
	title = t;
	duration = d;
	author = a;
	size = s;
    }
    
    int getSize()
    {
	return size;
    }
}


