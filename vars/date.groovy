#!groovy

def ourDateStamp (format)
{
	def date = new Date()
	return date.format(format)	
}
