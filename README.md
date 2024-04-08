<a href="https://recognito.vision" style="display: flex; align-items: center;">
    <img src="https://github.com/Recognito-Vision/Face-SDK-Linux-Demos/assets/153883841/b82f5c35-09d0-4064-a252-4bcd14e22407"/>
</a><br/>

# Face Recognition, Liveness Detection, Pose Estimation Android SDK Demo
<p align="center">
    <img alt="" src="https://recognito.vision/wp-content/uploads/2024/03/NIST.png" width=90%/>
</p>
<p align="center" style="font-size: 24px; font-weight: bold;">
    <a href="https://pages.nist.gov/frvt/html/frvt11.html" target="_blank">
        Latest NIST FRVT Report
    </a>  
</p>


## Introduction
This repository contains a demonstration of Recognito's face recognition SDK for Android. 
The SDK includes advanced features such as face recognition, liveness detection, and pose estimation. 
Recognito's face recognition algorithm has been ranked as the **Top 1 in the NIST FRVT** (Face Recognition Vendor Test).

## Features
- **Face Recognition:** Identify and verify individuals by comparing their facial features.
- **Liveness Detection:** Determine whether a face is live or spoofed to prevent fraud in authentication processes.
- **Pose Estimation:** Estimate the pose of a detected face, including Yaw, Roll, Pitch

### Additional Features
- **NIST FRVT Top 1 Algorithm:** Utilize the top-ranked face recognition algorithm from the NIST FRVT for accurate and reliable results.
- **On-premise:** Operate entirely within your infrastructure, ensuring data privacy and security.
- **Real-time:** Perform face recognition, liveness detection, and pose estimation with minimal latency.
- **Fully-offline:** Function without the need for an internet connection, ensuring reliability and data privacy.

## Demo Video
[<img src="https://github.com/Recognito-Vision/Face-SDK-Android-Demo/assets/153883841/532c2717-9249-491e-8206-bf16caadb18b" width="70%">](https://www.youtube.com/watch?v=9HM70PFa4lQ)

[www.youtube.com/@Recognito-Ltd](https://www.youtube.com/@Recognito-Ltd)
<p align="center">
  <img src="https://github.com/Recognito-Vision/Face-SDK-Android-Demo/assets/153883841/9d5813c0-2f9e-4ab5-a70a-38d8967c5b99" width="16%" />
  <img src="https://github.com/Recognito-Vision/Face-SDK-Android-Demo/assets/153883841/e7dab27d-5d41-4f66-8cdb-1978c53a8b87" width="16%" />
  <img src="https://github.com/Recognito-Vision/Face-SDK-Android-Demo/assets/153883841/700e1627-9b90-4354-923a-8dcc2536e9f0" width="16%" />
  <img src="https://github.com/Recognito-Vision/Face-SDK-Android-Demo/assets/153883841/0466d171-4a38-4fd4-ab27-33931711febc" width="16%" />
  <img src="https://github.com/Recognito-Vision/Face-SDK-Android-Demo/assets/153883841/02eef939-6b3f-4f68-a4cc-c116e0494fa8" width="16%" />
  <img src="https://github.com/Recognito-Vision/Face-SDK-Android-Demo/assets/153883841/d2f70698-932d-4bf0-900f-7f432b8702b7" width="16%" />
</p>

## Download APK
<a href="https://drive.google.com/file/d/1TYrTCMbo1COSgiQ_BvVyHhiS9BkUfZ-O/view?usp=drive_link" style="display: flex; align-items: center;">
    <img src="https://github.com/Recognito-Vision/Face-SDK-Android-Demo/assets/153883841/6277f598-aae5-44a3-ab16-4eb19e023d56", width=10%/>
</a><br/>

## SDK Integration
To use the Recognito SDK in your Android project, follow these steps:
#### 1. Add `libfacesdk` into the project
- Add the SDK folder to your Android project's directory.
- Add the following dependencies to your `build.gradle` file:
```groovy
dependencies {
    implementation project(path: ':libfacesdk')
}
