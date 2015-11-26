import pafy

url = "https://www.youtube.com/watch?v=y3rYhyIk8jM&index=14&list=PLjACqN5i5sDV-D_BntWUm7qTNO9eQihGb"
video = pafy.new(url);

print(video.title);

streams = video.allstreams
for s in streams:
	print (s)
best = video.getbest()
print(best)



best2  = video.getbest(preftype="mp4")
"""print(best2)
best2.download(filepath="/home/smalwe/Downloads/")

"""
