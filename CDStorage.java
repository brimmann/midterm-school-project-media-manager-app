class CDStorage
{
    final private int size = 100;
    private Mp3Song mp3Songs[] = new Mp3Song[max];
    private int top;
    private String type;
    
    CDStorage(String t)
    {
	top = -1;
	type = t;
    }
    
    void addSong(Song s) throws LimitExceedException
    {
	
	if(top >= songsSize) throw new LimitExceedException;
	else
	{
	    mp3Songs[++top] = s;
	}
    }
    
    Mp3Song getSongForPlayer(int i) throws EmptyTrackException
    {
	if(i > top) throw EmptyTrackException;
	else return mp3Songs[i];
    }
    
    int getSize()
    {
	return size;
    }
    
}
