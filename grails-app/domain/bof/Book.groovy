package bof

class Book {
	String title
	String description
	
	static belongsTo = [author: Author]
	
	static constraints = {
	}
}
