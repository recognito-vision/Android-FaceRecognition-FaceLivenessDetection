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
- Add the following dependency to your `build.gradle` and `settings.gradle` files:
  
  https://github.com/Recognito-Vision/Face-SDK-Android-Demo/blob/main/app/build.gradle#L50-L52
  
  https://github.com/Recognito-Vision/Face-SDK-Android-Demo/blob/main/settings.gradle#L17-L19

#### 2. Application License (One-Time License)
- For trial license, share your application ID.
  https://github.com/Recognito-Vision/Face-SDK-Android-Demo/blob/main/app/build.gradle#L6-L15
  <div style="display: flex; align-items: center;">
    <a target="_blank" href="mailto:hello@recognito.vision"><img src="https://img.shields.io/badge/email-hassan@recognito.vision-blue.svg?logo=gmail " alt="www.recognito.vision"></a>
    &nbsp;&nbsp;&nbsp;&nbsp;<a target="_blank" href="https://wa.me/+14158003112"><img src="https://img.shields.io/badge/whatsapp-+14158003112-blue.svg?logo=whatsapp " alt="www.recognito.vision"></a>
    &nbsp;&nbsp;&nbsp;&nbsp;<a target="_blank" href="https://t.me/recognito_vision"><img src="https://img.shields.io/badge/telegram-@recognito__vision-blue.svg?logo=telegram " alt="www.recognito.vision"></a>
    &nbsp;&nbsp;&nbsp;&nbsp;<a target="_blank" href="https://join.slack.com/t/recognito-workspace/shared_invite/zt-2d4kscqgn-"><img src="https://img.shields.io/badge/slack-recognito__workspace-blue.svg?logo=slack " alt="www.recognito.vision"></a>
  </div>

- Add your license to `assets/license` file:
  https://github.com/Recognito-Vision/Face-SDK-Android-Demo/blob/main/app/src/main/assets/license#L1-L5
- Initialize SDK with license.
  https://github.com/Recognito-Vision/Face-SDK-Android-Demo/blob/main/app/src/main/java/com/bio/facerecognition/MainActivity.kt#39-L47

  Initialization status codes:
  
  | Code | Status |
  |:------:|------|
  |0|Activate SDK successfully|
  |-1|License Key Error|
  |-2|License AppID Error|
  |-3|License Expired|
  |-4|Activate Error|
  |-5|Init SDK Error|
#### 3. APIs of SDK 
##### - Activate SDK
```java
public static native int setActivation(String var0);
```
Parameters
- `var0`: The license string.
- Return Value: An integer representing the SDK activation status code.
<br/>

##### - Initiate SDK
```java
public static native int init(AssetManager var0);
```
Parameters
- `var0`: An instance of AssetManager used to access application assets.
- Return Value: An integer representing the initialization status code.
<br/>

##### - Convert YUV camera frame to Bitmap image
```java
public static native Bitmap yuv2Bitmap(byte[] nv21, int width, int height, int orientation);
```
Parameters
- `nv21`: Byte array representing the YUV image data in NV21 format.
- `width`: Width of the image.
- `height`: Height of the image.
- `orientation`: Orientation of the image
  
  | Value | Orientation |
  |:----:|----|
  |1|No processing|
  |2|Flip horizontally|
  |3|Flip horizontally first and then flip vertically|
  |4|vertical flip|
  |5|transpose|
  |6|Rotate 90° clockwise|
  |7|Horizontal and vertical flip --> transpose|
  |8|Rotate 90° counterclockwise|
- Return Value: A Bitmap object representing the converted image.
<br/>

##### - Detect Face
```java
public static native List<FaceBox> faceDetection(Bitmap var0, FaceDetectionParam var1);
```
Parameters
- `var0`: The Bitmap image.
- `var1`: Parameters for face detection
```java
public class FaceDetectionParam {
    public boolean check_liveness = false;
    public int check_liveness_level = 0; // 0: more accurate model, 1: lighter model
}
```
- Return Value: A list of FaceBox objects representing the detected faces.
```java
public class FaceBox {
    public int x1;
    public int y1;
    public int x2;
    public int y2;
    public float liveness;
    public float yaw;
    public float roll;
    public float pitch;
}
```
<br/>

##### - Extract face feature
```java
public static native byte[] templateExtraction(Bitmap var0, FaceBox var1);
```
Parameters
- `var0`: The Bitmap image
- `var1`: The bounding box (`FaceBox`) of the detected face.
- Return Value: A byte array representing the extracted template from the face.
<br/>
  
##### - Calculate similarity between two face features
```java
public static native float similarityCalculation(byte[] var0, byte[] var1);
```
Parameters
- `var0`: The byte array representing the first face template.
- `var1`: The byte array representing the second face template.
- Return Value: A float value representing the similarity score between the two face templates.
<br/>

## <img src="https://github.com/Recognito-Vision/Face-SDK-Linux-Demos/assets/153883841/78c5efee-15f3-4406-ab4d-13fd1182d20c" alt="contact" width="25">  Support
For any questions, issues, or feature requests, please contact our support team.

<div style="display: flex; align-items: center;">
    <a target="_blank" href="mailto:hello@recognito.vision"><img src="https://img.shields.io/badge/email-hassan@recognito.vision-blue.svg?logo=gmail " alt="www.recognito.vision"></a>
    &nbsp;&nbsp;&nbsp;&nbsp;<a target="_blank" href="https://wa.me/+14158003112"><img src="https://img.shields.io/badge/whatsapp-+14158003112-blue.svg?logo=whatsapp " alt="www.recognito.vision"></a>
    &nbsp;&nbsp;&nbsp;&nbsp;<a target="_blank" href="https://t.me/recognito_vision"><img src="https://img.shields.io/badge/telegram-@recognito__vision-blue.svg?logo=telegram " alt="www.recognito.vision"></a>
    &nbsp;&nbsp;&nbsp;&nbsp;<a target="_blank" href="https://join.slack.com/t/recognito-workspace/shared_invite/zt-2d4kscqgn-"><img src="https://img.shields.io/badge/slack-recognito__workspace-blue.svg?logo=slack " alt="www.recognito.vision"></a>
</div>
<br/>
<p align="center">
    &emsp;&emsp;<a href="https://recognito.vision" style="display: flex; align-items: center;"><img src="https://recognito.vision/wp-content/uploads/2024/03/recognito_64_cl.png" style="width: 32px; margin-right: 5px;"/></a>
    &nbsp;&nbsp;&nbsp;&nbsp;<a href="https://www.linkedin.com/company/recognito-vision" style="display: flex; align-items: center;"><img src="https://recognito.vision/wp-content/uploads/2024/03/linkedin_64_cl.png" style="width: 32px; margin-right: 5px;"/></a>
    &nbsp;&nbsp;&nbsp;&nbsp;<a href="https://huggingface.co/Recognito" style="display: flex; align-items: center;"><img src="https://recognito.vision/wp-content/uploads/2024/03/hf_64_cl.png" style="width: 32px; margin-right: 5px;"/></a>
    &nbsp;&nbsp;&nbsp;&nbsp;<a href="https://github.com/Recognito-Vision" style="display: flex; align-items: center;"><img src="https://recognito.vision/wp-content/uploads/2024/03/github_64_cl.png" style="width: 32px; margin-right: 5px;"/></a>
    &nbsp;&nbsp;&nbsp;&nbsp;<a href="https://hub.docker.com/u/recognito" style="display: flex; align-items: center;"><img src="https://recognito.vision/wp-content/uploads/2024/03/docker_64_cl.png" style="width: 32px; margin-right: 5px;"/></a>
</p>
