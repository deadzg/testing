import urllib2
from bs4 import BeautifulSoup

url = "http://data2.7m.cn/Matches_data/92/en/standing.shtml"
req = urllib2.urlopen(url)
page = req.read()

scrap = BeautifulSoup(page,'html.parser')

#print scrap.prettify()

for link in scrap.findAll('td'):
    print(link.get('a'))
    #print link.contents
#print scrap.findAll('a')
