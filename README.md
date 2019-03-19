# ModelView - Saving UI states

We can use ViewModel for saving the ui states that happened because of the configuration changes (such as screen orientation). It allows quick access to UI data and helps you avoid refetching data from network or disk across rotation, window resizing, and other commonly occurring configuration changes.

But there is a important thing:

ViewModels are automatically destroyed by the system when your user backs out of your activity or fragment or if you call finish().Unlike saved instance state, ViewModels are destroyed during a system-initiated process death. This is why you should use ViewModel objects in combination with onSaveInstanceState() 



