import time
import winsound
print("This is an Alarm made by GVP")
def myAlarm():
    try:
        myTime=list(map(int, input("Enter time in hr min sec\n").split()))
        if len(myTime)==3:
            total_seconds=myTime[0]+60+60+myTime[1]+60+myTime[2]
            time.sleep(total_seconds)
            frequency=2500
            duration=1000
            winsound.Beep(frequency, duration)
        else:
            print("Please enter time in correct format as mentioned\n")
            myAlarm()
    except Expection as e:
            print("This is the exception\n",e,"So!, please enter correct details ")
            myAlarm()
            
myAlarm()
