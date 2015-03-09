#include <string.h>
#include <com_example_dynamicload_jni_DynamicLoadHelper.h>

/*
 * Class:     com_example_dynamicload_jni_DynamicLoadHelper
 * Method:    getSOName
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_example_dynamicload_jni_DynamicLoadHelper_getSOName
  (JNIEnv *env, jobject thiz)
{
	return "SSOOOOO";
}

/*
 * Class:     com_example_dynamicload_jni_DynamicLoadHelper
 * Method:    plus
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_com_example_dynamicload_jni_DynamicLoadHelper_plus
  (JNIEnv *env, jobject thiz, jint a, jint b)
{
	return  a + b;
}
