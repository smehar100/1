package hello;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;



public class MovieNight {
    public static Boolean canViewAll(Collection<Movie> movies) {
  
    	List<Movie> userList = new ArrayList<Movie>(movies);
    	
    	start1.getTime() <= end2.getTime() && start2.getTime() <= end1.getTime()
    	/*Collections.sort(userList, new IntervalComparator());
    	*/
    	for(int i=0;i<userList.size();i++){
    		if(userList.get(i).getStart().get<=)
    	}

		return null;
   
        
    }

    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("y-M-d H:m");

        ArrayList<Movie> movies = new ArrayList<Movie>();
        movies.add(new Movie(sdf.parse("2015-01-01 20:00"), sdf.parse("2015-01-01 21:30")));
        movies.add(new Movie(sdf.parse("2015-01-01 21:30"), sdf.parse("2015-01-01 23:00")));
        movies.add(new Movie(sdf.parse("2015-01-01 23:10"), sdf.parse("2015-01-01 23:30")));

        System.out.println(MovieNight.canViewAll(movies));
    }
}

class Movie {
    private Date start, end;
    
    public Movie(Date start, Date end) {
        this.start = start;
        this.end = end;
    }
    
    public Date getStart() {
        return this.start;
    }
    
    public Date getEnd() {
        return this.end;
    } 
}

class IntervalComparator implements Comparator{
    public int compare(Object o1, Object o2){
    	Movie i1 = (Movie)o1;
    	Movie i2 = (Movie)o2;
    	if(i1.getStart().getTime()<=i2.getEnd().getTime() && i2.getStart().getTime()<=i1.getEnd().getTime())
    		return -1;
    	else
    		return 1;
    }
}
