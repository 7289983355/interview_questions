package trickey;


enum Season {
	WINTER ,SPRING,SUMMER,FALL;
	
	static Season getSeason(int index){
      return Season.values()[index];	
	}
}


