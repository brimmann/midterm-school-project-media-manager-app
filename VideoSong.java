class VideoSong extends Song
{
    private int px;
    private int py;
    Mp3Song(String t, int d, String a, int s, int x, int y)
    {
	super(t, d, a, s);
	px = x;
	py = y;
    }
    
    int getSize()
    {
	return size;
    }
}
