/*
 * Copyright (c) 2020-2021 Skymind Education Group Sdn. Bhd.
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

 * SPDX-License-Identifier: Apache-2.0
 */

package global.skymind.solution.intermediate.collections;
import java.util.*;

public class Ex13_HashSet {
    public static void main(String args[]){
        LinkedHashSet<String> set=new LinkedHashSet<String>();
        set.add("Dr. Pranesh");
        set.add("Hidayah");
        set.add("Zul");
        set.add("Hidayah");
        set.add("Yuen");
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

//import java.util.HashSet;
//public class DemoSet{
//    public static void main(String[] args) {
//        HashSet<String> setFruits= new HashSet<String>();
//        setFruits.add("rambutan");
//        setFruits.add("jackfruit");
//        setFruits.add("mangoesteen");
//        setFruits.add("jackfruit");
//        System.out.println(setFruits);
//    }
//}