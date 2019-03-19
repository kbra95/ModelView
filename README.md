# ModelView - Saving UI states

We can use ViewModel for saving the ui states that happened because of the configuration changes (such as screen orientation). It allows quick access to UI data and helps you avoid refetching data from network or disk across rotation, window resizing, and other commonly occurring configuration changes.

But there is a important thing:

ViewModels are automatically destroyed by the system when your user backs out of your activity or fragment or if you call finish().Unlike saved instance state, ViewModels are destroyed during a system-initiated process death. This is why you should use ViewModel objects in combination with onSaveInstanceState() 






I will adjust the according to the countries and their scores. But for doing this the viewmodel can be insufficient and we may be need to use other options for preserving yhe ui states (onSaveInstanceState(), SharedPreferences, Database).



![image](https://user-images.githubusercontent.com/33482304/54633525-65ca9780-4a91-11e9-8f56-bb30570533a3.png)


