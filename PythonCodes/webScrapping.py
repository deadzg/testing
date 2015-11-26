import urllib2
from bs4 import BeautifulSoup
from time import sleep
from datetime import datetime


def getSensex():
    url = "http://timesofindia.com/business"


    req = urllib2.urlopen(url)
    page = req.read()
    scraping = BeautifulSoup(page,'html.parser')

    sensex = scraping.findAll("span", attrs={"class":"green14px"})[0].text

    return sensex


with open("sensex.out", "w") as f:
        for x in range(2,100):
                sNow = datetime.now().strftime("%I:%M:%S%p")
                ss = getSensex()
                print("{0}, {1} \n".format(sNow, ss))
                f.write("{0}, {1} \n".format(sNow, ss))
                sleep(1)
