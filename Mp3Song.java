class Mp3Song extends Song
{
    private int songQuality;
    Mp3Song(String t, int d, String a, int s, int q)
    {
	super(t, d, a, s);
	songQuality = q;
    }
    
    int getSize()
    {
	return size;
    }
    
    int getTitle()
    {
	return title;
    }
    
    int getDuration()
    {
	return duration;
    }
}
