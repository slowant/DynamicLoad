LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := dynamicload_jni
LOCAL_SRC_FILES := com_example_dynamicload_jni_DynamicLoadHelper.c

include $(BUILD_SHARED_LIBRARY)
