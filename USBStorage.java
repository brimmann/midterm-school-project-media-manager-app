class USBStorage extends MediaStorage
{
    private int maxSize;
    private Mp3Song mp3Songs[] = new Mp3Song[100];
    private Song allSongs[] = new Song[100];
    private int top;
    private int mp3Top; 
    
    USBStorage(int s)
    {
	songsSize = 0;
	top = -1;
	mp3Top = -1;
	maxSize = s;
    }
    
    
    void addSong(Song s) throws LimitExceedException
    {
	int s = 0;
	if(top != -1)
	{
	    for(int i = 0; i < top; i++)
	    {
		s += s.getSize;
	    }
	}
	
	if(s >= maxSize) throw new LimitExceedException;
	else
	{
	     allSongs[++top] = s; 
	     if(s instanceof Mp3Song) mp3Songs[++top] = s;
	}
    }
    
    Mp3Song getSongForPlayer(int i) throws EmptyTrackException
    {
	if(i > mp3Top) throw EmptyTrackException;
	else return mp3Songs[i];
    }
    
    int getSize()
    {
	return maxSize;
    }
    
    
    
}
