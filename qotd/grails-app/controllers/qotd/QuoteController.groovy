package qotd

class QuoteController {

    def index = { 
		redirect(action:home)
	}

	def home = {
		render "<h1> Real Programmers do not eat Quiche</h1>"
	}
	
	def random = {
		def staticQuote = new Quote(author:"Salman Paracha", content:"I am awesome")
		[quote: staticQuote]
	}
}
