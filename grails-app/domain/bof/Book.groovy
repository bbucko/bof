package bof

class Book {
	String title
	
	static belongsTo = [author: Author]
	
	static constraints = {
	}
	
	String toString(){
		"${title}"
	}
}
