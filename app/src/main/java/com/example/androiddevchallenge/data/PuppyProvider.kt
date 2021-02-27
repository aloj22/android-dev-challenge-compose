/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.model.Puppy

class PuppyProvider {

    val puppies = listOf(
        Puppy(
            "Barj",
            "German Shepherd",
            "https://www.zooplus.es/magazine/wp-content/uploads/2019/03/deutscher-sch%C3%A4ferhund-1024x681.jpg",
            "A strongly built, relatively long-bodied dog, the German shepherd stands 22 to 26 inches (56 to 66 cm) and weighs 75 to 95 pounds (34 to 43 kg). Its coat is of coarse, medium-long outer hair and shorter, dense inner hair and ranges from white or pale gray to black and is often gray and black or black and tan."
        ),
        Puppy(
            "Donnie",
            "Greyhound",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/5/5d/Italian_Greyhound_standing_gray_%28cropped%29.jpg/330px-Italian_Greyhound_standing_gray_%28cropped%29.jpg",
            "Greyhounds were originally bred as hunting dogs to chase hare, foxes, and deer. Canines in this dog breed can reach speeds of 40 to 45 miles per hour, making them the Ferraris of the dog world. Fans of the breed often claim that these dogs have two speeds: all-out sprint and total couch potato"
        ),
        Puppy(
            "Willy",
            "Great Dane",
            "https://vetstreet-brightspot.s3.amazonaws.com/5b/52/49deed4f440ea965d0ff16fca655/great-dane-AP-PFYPXJ-645sm12913.jpg",
            "The Great Dane was developed from Mastiff-type dogs, but they're more refined than other descendants of this ancient breed. A Great Dane is sleek and elegant. They have an athletic, muscular body. Their massive head--and massive is the right word--is long and narrow."
        ),
        Puppy(
            "Barj",
            "German Shepherd",
            "https://www.zooplus.es/magazine/wp-content/uploads/2019/03/deutscher-sch%C3%A4ferhund-1024x681.jpg",
            "A strongly built, relatively long-bodied dog, the German shepherd stands 22 to 26 inches (56 to 66 cm) and weighs 75 to 95 pounds (34 to 43 kg). Its coat is of coarse, medium-long outer hair and shorter, dense inner hair and ranges from white or pale gray to black and is often gray and black or black and tan."
        ),
        Puppy(
            "Donnie",
            "Greyhound",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/5/5d/Italian_Greyhound_standing_gray_%28cropped%29.jpg/330px-Italian_Greyhound_standing_gray_%28cropped%29.jpg",
            "Greyhounds were originally bred as hunting dogs to chase hare, foxes, and deer. Canines in this dog breed can reach speeds of 40 to 45 miles per hour, making them the Ferraris of the dog world. Fans of the breed often claim that these dogs have two speeds: all-out sprint and total couch potato"
        ),
        Puppy(
            "Willy",
            "Great Dane",
            "https://vetstreet-brightspot.s3.amazonaws.com/5b/52/49deed4f440ea965d0ff16fca655/great-dane-AP-PFYPXJ-645sm12913.jpg",
            "The Great Dane was developed from Mastiff-type dogs, but they're more refined than other descendants of this ancient breed. A Great Dane is sleek and elegant. They have an athletic, muscular body. Their massive head--and massive is the right word--is long and narrow."
        ),
        Puppy(
            "Barj",
            "German Shepherd",
            "https://www.zooplus.es/magazine/wp-content/uploads/2019/03/deutscher-sch%C3%A4ferhund-1024x681.jpg",
            "A strongly built, relatively long-bodied dog, the German shepherd stands 22 to 26 inches (56 to 66 cm) and weighs 75 to 95 pounds (34 to 43 kg). Its coat is of coarse, medium-long outer hair and shorter, dense inner hair and ranges from white or pale gray to black and is often gray and black or black and tan."
        ),
        Puppy(
            "Donnie",
            "Greyhound",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/5/5d/Italian_Greyhound_standing_gray_%28cropped%29.jpg/330px-Italian_Greyhound_standing_gray_%28cropped%29.jpg",
            "Greyhounds were originally bred as hunting dogs to chase hare, foxes, and deer. Canines in this dog breed can reach speeds of 40 to 45 miles per hour, making them the Ferraris of the dog world. Fans of the breed often claim that these dogs have two speeds: all-out sprint and total couch potato"
        ),
        Puppy(
            "Willy",
            "Great Dane",
            "https://vetstreet-brightspot.s3.amazonaws.com/5b/52/49deed4f440ea965d0ff16fca655/great-dane-AP-PFYPXJ-645sm12913.jpg",
            "The Great Dane was developed from Mastiff-type dogs, but they're more refined than other descendants of this ancient breed. A Great Dane is sleek and elegant. They have an athletic, muscular body. Their massive head--and massive is the right word--is long and narrow."
        ),
    )

    fun getPuppyByName(name: String) = puppies.first { it.name == name }
}
