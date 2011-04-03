package bof

class Book {
	String title
	
	static belongsTo = [author: Author]
	
	static constraints = {
		title blank: false
	}
	
	String toString(){
		"${title}"
	}
}
