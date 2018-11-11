package hello;

public class Path {
    private String path;

    public Path(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    /**
     * @param newPath
     */
    public void cd(String newPath) {
        
    	//System.out.println(newPath.length());
    	//System.out.println(newPath.substring(2, newPath.length()));
    	
    for(int i=0;i<newPath.length();i++){
    	if(newPath.charAt(i)=='.'&&newPath.charAt(i++)=='.'){
    		int m=0;
    		String str="";
    		for(int j=i;j<0;j--){
    			if(Character.isAlphabetic(newPath.charAt(j))){
    				str=str+newPath.charAt(j);
    			}
    		}
    		path=path.replaceAll("/"+str, "");
    		
    		i=m;
    		
    	}
    	else if(newPath.length()==1 && newPath.charAt(i)=='/'){
    		path=path.substring(0, 2);
    	}
    	else if(newPath.charAt(i)=='/'){
    		path=path+newPath.substring(i,i+2);
    		i++;
    	}
    }
    	
    	
    	
    }

    public static void main(String[] args) {
        Path path = new Path("/a/b/c/dsss");
        path.cd("..");
        System.out.println(path.getPath());
    }
}
