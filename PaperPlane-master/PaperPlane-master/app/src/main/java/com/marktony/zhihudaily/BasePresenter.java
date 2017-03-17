/*
 * Copyright 2017 lizhaotailang
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.marktony.zhihudaily;

/**
 * Created by Lizhaotailang on 2016/9/3.
 */

public interface BasePresenter {

    /**
     * get the data and etc.获取数据并改变界面显示，在todo-mvp的项目中的调用时机为Fragment的OnResume()方法中
     */
    void start();

}
