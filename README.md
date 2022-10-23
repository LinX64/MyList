# My Servers List
An example of Flow, Clean Architecture, Koin, ListAdapter and Usecases.

### Why not RecyclerView Adapter, ListAdapter?

`ListAdapter` is just an extension of `RecyclerView.Adapter`. It computes diffs between Lists on a background thread with AsyncListDiff. 
We need to pass DiffUtil class in the `ListAdapter` To do the computation and check between the items. There are also no performance differences between that RecyclerView adapter and the `list adapter`.

Advantages: No need to have a submit list method to set the data. Everything is being handled by calling `submitList()`

### Why Koin?

I always used to use Hilt-Dagger for DI but seems like Koin is much simpler and there is only one problem with it. It basically resolves dependencies at runtime, and this is the most important downside of Koin, however, it is really easy to use compared to Hilt and dagger.
