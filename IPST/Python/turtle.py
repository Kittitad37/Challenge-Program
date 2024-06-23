from turtle import*

def draw (w,s):
    s*=2
    for i in range(s):
        fd(w)
        lt(360/s)

draw(100,5)
draw(100,4)
draw(100,3)