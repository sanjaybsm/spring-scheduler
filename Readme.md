#Spring boot scheduler and retry example
Spring test examples for scheduler and retry

After Running the program you should see output on the console like below
```java 
2020-03-15 18:48:22.294  INFO 10872 --- [   scheduling-1] c.s.e.s.s.s.scheduler.SchedulerTasks     : The time is now 18:48:22
2020-03-15 18:48:25.294  INFO 10872 --- [   scheduling-1] c.s.e.s.s.s.s.retry.SpringRetryExample   : Printing attempts :: 
2020-03-15 18:48:26.294  INFO 10872 --- [   scheduling-1] c.s.e.s.s.s.s.retry.SpringRetryExample   : Printing attempts :: 
2020-03-15 18:48:27.295  INFO 10872 --- [   scheduling-1] c.s.e.s.s.s.s.retry.SpringRetryExample   : Printing attempts :: 
2020-03-15 18:48:27.296  INFO 10872 --- [   scheduling-1] c.s.e.s.s.s.scheduler.SchedulerTasks     : exception : 

```