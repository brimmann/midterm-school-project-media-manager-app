class Player
{
    private String manName;
    private String model;
    private StorageMedia st;
    private Mp3Song currenSong;
    
    Player(String m, String m)
    {
	manName = m;
	model = m;
	st = null;
	currentSong = null;
    }
    void mount(SotrageMedia s) throws LimitExceedException, NonMp3TypeException
    {
	if(s instanceof USBStorage)
	{
	    if(s.getSize >= 16000) throw LimitExceedException;
	}
	else if(s.getType != "mp3" ) throw NonMp3TypeException;
	trackNumber = 0;
	st = s;
	current = st.getSongForPlayer(trackNumber);
	System.out.println("Playing Song Title: " + currentSong.getTitle() + " Duration: " + currentSong.getDuration() + " seconds");
	//After finishing the first songs increase trackNumber by one to play the next song
    }
    
    void unmount()
    {
	if(st == null) 
	{
	    System.out.println("Player is already unmounted");
	    return;
	}
	
	st = null;
	currenSong = null;
    }
    
    
    
    
}
