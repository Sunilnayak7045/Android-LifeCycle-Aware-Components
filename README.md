Creation phase:
Activity is called 1st then Observer. 

2022-03-21 16:16:07.997 29239-29239/com.example.lifecycleawarecomponent D/Main: Activity On-Create
2022-03-21 16:16:07.998 29239-29239/com.example.lifecycleawarecomponent D/Main: Observer On-Create
2022-03-21 16:16:08.005 29239-29239/com.example.lifecycleawarecomponent D/Main: Activity ON-RESUME
2022-03-21 16:16:08.005 29239-29239/com.example.lifecycleawarecomponent D/Main: Observer ON-RESUME


Destroy phase:
Observer is called 1st then Activity. 

2022-03-21 16:16:15.123 29239-29239/com.example.lifecycleawarecomponent D/Main: Observer ON-PAUSE
2022-03-21 16:16:15.123 29239-29239/com.example.lifecycleawarecomponent D/Main: Activity ON-PAUSE
2022-03-21 16:16:17.142 29239-29239/com.example.lifecycleawarecomponent D/Main: Observer  ON-STOP
2022-03-21 16:16:17.143 29239-29239/com.example.lifecycleawarecomponent D/Main: Activity  ON-STOP
2022-03-21 16:16:38.854 29239-29239/com.example.lifecycleawarecomponent D/Main: Observer ON-DESTROY
2022-03-21 16:16:38.854 29239-29239/com.example.lifecycleawarecomponent D/Main: Activity ON-DESTROY

Application Example : youtube

Advantage : Observer is now seperated from activity so it can be attached to different activity.
