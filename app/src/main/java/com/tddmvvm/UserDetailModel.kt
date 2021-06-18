package com.tddmvvm

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class UserDetailModel : BaseObservable() {

    @get:Bindable
    var userName: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.userName)
        }

    @get:Bindable
    var password: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.password)
        }

}
