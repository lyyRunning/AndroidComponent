package com.function.luo.commonlib;


import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author luo
 * @date 2019/5/30
 */

public class Student  implements Parcelable{

    public String name;

    public String time;


    public Student() {
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }




    protected Student(Parcel in) {
        name = in.readString();
        time = in.readString();
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(time);
    }
}
