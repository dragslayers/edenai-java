/*
 * Eden AI API Documentation
 * <a href=\"https://app.edenai.run/user/login\" target=\"_blank\"><img src=\"/static/images/welcome.png\"></a>. # Welcome  Eden AI simplifies the use and integration of AI technologies by providing a unique API connected to the best AI engines and combined with a powerful management platform. The platform covers a wide range of AI technologies: * Vision:  <a href=\"https://www.edenai.co/vision\" target=\"_blank\">www.edenai.co/vision</a>. * Text & NLP: <a href=\"https://www.edenai.co/text\" target=\"_blank\">www.edenai.co/text</a>. * Speech & Audio: <a href=\"https://www.edenai.co/speech\" target=\"_blank\">www.edenai.co/speech</a>. * OCR: <a href=\"https://www.edenai.co/ocr\" target=\"_blank\">www.edenai.co/ocr</a>. * Machine Translation: <a href=\"https://www.edenai.co/translation\" target=\"_blank\">www.edenai.co/translation</a>. * Prediction: <a href=\"https://www.edenai.co/prediction\" target=\"_blank\">www.edenai.co/prediction</a>.  For all the proposed technologies, we provide a single endpoint:  the service provider is only a parameter that can be changed very easily. All the engines available on Eden AI are listed here: www.edenai.co/catalog  # Support & community  ### 1- Support If you have any problems, please contact us at this email address: contact@edenai.co. We will be happy to help you in the use of Eden AI.   ### 2- Community  You can interact personally with other people actively using and working with Eden AI and join our  <a href=\"https://join.slack.com/t/edenai/shared_invite/zt-t68c2pr9-4lDKQ_qEqmLiWNptQzB_6w\" target=\"_blank\">Slack community</a>.  We are always updating our docs, so a good way to always stay up to date is to watch our documentation repo on Github: <a href=\"https://github.com/edenai\" target=\"_blank\">https://github.com/edenai</a>.  ### 3- Blog  We also regularly publish various articles with Eden AI news and technical articles on the different AI engines that exist. You can find these articles here: <a href=\"https://www.edenai.co/blog\" target=\"_blank\">https://www.edenai.co/blog</a>.   # Authentication  ## Create account ![Register](/static/images/register.png)  To create an account, please go to this link: <a href=\"https://app.edenai.run/user/login\" target=\"_blank\">app.edenai.run/user/login</a>. You can create an account with your email address or by using your account on available platforms (Gmail, Github, etc.).   By creating an account with your email address, you will receive a confirmation email with a link to click. Check your spam if needed and contact us if you have any problem: contact@edenai.co  ![Login](/static/images/login.png) ## API key  By going to your account page on the platform: <a href=\"https://app.edenai.run/admin/account\" target=\"_blank\">https://app.edenai.run/admin/account</a>, you will have access to your API key to start using the different AI engines offered by Eden AI.   ![api_key](/static/images/api_key.png)  ## Sandbox API key  By going to your account page on the platform: <a href=\"https://app.edenai.run/admin/account\" target=\"_blank\">https://app.edenai.run/admin/account</a>, you will also have access to your **Sandbox** API key that will allow you to make free calls and get dummy responses in order to implement and debug Eden AI without consuming credits.   ![api_key](/static/images/sandbox_api_key.png)  # Portal Guide  Eden AI provides a web portal that allows you to do several tasks:  ![portal](/static/images/portal.png)  ### 1- Benchmark and test The platform allows you to easily compare competing engines without having to code. By uploading your data, you have access to the prediction results of the different engines. This gives you a first overview of the performance of AI engines.   ![benchmark](/static/images/benchmark.png)  ### 2- Cost management The <a href=\"https://app.edenai.run/admin/cost-management\" target=\"_blank\">cost management page</a> also allows you to centralize the costs associated with the different engines with various filters to simplify the analysis.   This page also allows you to define monthly budget limits not to be exceeded to secure the use of different AI engines.   ![cost-management](/static/images/cost_management.png) ### 3- Account The <a href=\"https://app.edenai.run/admin/account\" target=\"_blank\">account page</a> allows you to change your information and password. It also gives you access to your API key that you can renew if needed.   This page also allows you to add a credit card and to buy with credits to use all the engines offered by Eden AI.   ![account](/static/images/account.png)   # API Guide  Eden AI API has different endpoints that refer to different AI services. The connected providers are thus parameters that the user can easily change. 
 *
 * OpenAPI spec version: v1
 * Contact: contact@edenai.co
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import edenai.ApiCallback;
import edenai.ApiClient;
import edenai.ApiException;
import edenai.ApiResponse;
import edenai.Configuration;
import edenai.Pair;
import edenai.ProgressRequestBody;
import edenai.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.io.File;
import io.swagger.client.model.InlineResponse200;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PipelinesApi {
    private ApiClient apiClient;

    public PipelinesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PipelinesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for pipelines
     * @param description The desciption field must be an array of ordered dictionaries.                                                      Each dictionary describes the feature to call. in fact, it has to contain two keys \&quot;feature\&quot; and \&quot;params\&quot;.   * feature conatins a string (the value of the feature ex : automatic_translation).  * params contains a dictionary of parameters to be used to call the feature, see the feature corresponding documentation to know which parameters well be needed.   ex : &#x60;[ { \&quot;feature\&quot;: \&quot;ocr\&quot;,  \&quot;params\&quot;: { \&quot;providers\&quot;: \&quot;[&#39;amazon&#39;]\&quot;,\&quot;language\&quot;: \&quot;en-US\&quot; } }, { \&quot;feature\&quot;: \&quot;syntax_analysis\&quot;,  \&quot;params\&quot;: { \&quot;providers\&quot;: \&quot;[&#39;amazon&#39;]\&quot;,\&quot;language\&quot;: \&quot;en-US\&quot; } }]&#x60;                                                       (required)
     * @param returnOnlyLast This parameter allows user to choose to output only the final result or all the intermediate results. (required)
     * @param text The input text for the first feature of the pipeline (optional)
     * @param files The input file for the first feature of the pipeline (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call pipelinesCall(String description, Boolean returnOnlyLast, String text, File files, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pipelines";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (description != null)
        localVarFormParams.put("description", description);
        if (text != null)
        localVarFormParams.put("text", text);
        if (files != null)
        localVarFormParams.put("files", files);
        if (returnOnlyLast != null)
        localVarFormParams.put("return_only_last", returnOnlyLast);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Bearer" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call pipelinesValidateBeforeCall(String description, Boolean returnOnlyLast, String text, File files, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'description' is set
        if (description == null) {
            throw new ApiException("Missing the required parameter 'description' when calling pipelines(Async)");
        }
        
        // verify the required parameter 'returnOnlyLast' is set
        if (returnOnlyLast == null) {
            throw new ApiException("Missing the required parameter 'returnOnlyLast' when calling pipelines(Async)");
        }
        

        com.squareup.okhttp.Call call = pipelinesCall(description, returnOnlyLast, text, files, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Pipelines let you combine different AI APIs from different providers into a single ready to use pipeline that you can run on your data.   **AVAILABLE FEATURES**   |Feature                   |Value|Can be first|Can be followed by| |--------------------------|-----------------------|------------|------------------| |**OCR**                     |&#x60;ocr&#x60;                  |&#x60;True&#x60;      |Sentiment Analysis, Syntax Analysis, Keyword Analysis, Named Entity Recognition, Text to speech, Translation,  Language Detection  | |**Translation**             |&#x60;automatic_translation&#x60;|&#x60;True&#x60;      |Sentiment Analysis, Syntax Analysis, Keyword Analysis, Named Entity Recognition, Text to speech, Language Detection                | |**Speech recognition**      |&#x60;speech_to_text&#x60;       |&#x60;True&#x60;      |Sentiment Analysis, Syntax Analysis, Keyword Analysis, Named Entity Recognition, Text to speech, Translation,  Language Detection  | |**Sentiment Analysis**      |&#x60;sentiment_analysis&#x60;   |&#x60;False&#x60;     |None                                                                                                                               | |**Syntax Analysis**         |&#x60;syntax_analysis&#x60;      |&#x60;False&#x60;     |None                                                                                                                               | |**Keyword Analysis**        |&#x60;keyword_extraction&#x60;   |&#x60;False&#x60;     |None                                                                                                                               | |**Named Entity Recognition**|&#x60;language_detection&#x60;   |&#x60;False&#x60;-    |None                                                                                                                               | |**Language Detection**      |&#x60;language_detection&#x60;   |&#x60;False&#x60;     |None                                                                                                                               | |**Text to speech**          |&#x60;text_to_speech&#x60;       |&#x60;False&#x60;     |None                                                                                                                               | 
     * @param description The desciption field must be an array of ordered dictionaries.                                                      Each dictionary describes the feature to call. in fact, it has to contain two keys \&quot;feature\&quot; and \&quot;params\&quot;.   * feature conatins a string (the value of the feature ex : automatic_translation).  * params contains a dictionary of parameters to be used to call the feature, see the feature corresponding documentation to know which parameters well be needed.   ex : &#x60;[ { \&quot;feature\&quot;: \&quot;ocr\&quot;,  \&quot;params\&quot;: { \&quot;providers\&quot;: \&quot;[&#39;amazon&#39;]\&quot;,\&quot;language\&quot;: \&quot;en-US\&quot; } }, { \&quot;feature\&quot;: \&quot;syntax_analysis\&quot;,  \&quot;params\&quot;: { \&quot;providers\&quot;: \&quot;[&#39;amazon&#39;]\&quot;,\&quot;language\&quot;: \&quot;en-US\&quot; } }]&#x60;                                                       (required)
     * @param returnOnlyLast This parameter allows user to choose to output only the final result or all the intermediate results. (required)
     * @param text The input text for the first feature of the pipeline (optional)
     * @param files The input file for the first feature of the pipeline (optional)
     * @return InlineResponse200
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse200 pipelines(String description, Boolean returnOnlyLast, String text, File files) throws ApiException {
        ApiResponse<InlineResponse200> resp = pipelinesWithHttpInfo(description, returnOnlyLast, text, files);
        return resp.getData();
    }

    /**
     * 
     * Pipelines let you combine different AI APIs from different providers into a single ready to use pipeline that you can run on your data.   **AVAILABLE FEATURES**   |Feature                   |Value|Can be first|Can be followed by| |--------------------------|-----------------------|------------|------------------| |**OCR**                     |&#x60;ocr&#x60;                  |&#x60;True&#x60;      |Sentiment Analysis, Syntax Analysis, Keyword Analysis, Named Entity Recognition, Text to speech, Translation,  Language Detection  | |**Translation**             |&#x60;automatic_translation&#x60;|&#x60;True&#x60;      |Sentiment Analysis, Syntax Analysis, Keyword Analysis, Named Entity Recognition, Text to speech, Language Detection                | |**Speech recognition**      |&#x60;speech_to_text&#x60;       |&#x60;True&#x60;      |Sentiment Analysis, Syntax Analysis, Keyword Analysis, Named Entity Recognition, Text to speech, Translation,  Language Detection  | |**Sentiment Analysis**      |&#x60;sentiment_analysis&#x60;   |&#x60;False&#x60;     |None                                                                                                                               | |**Syntax Analysis**         |&#x60;syntax_analysis&#x60;      |&#x60;False&#x60;     |None                                                                                                                               | |**Keyword Analysis**        |&#x60;keyword_extraction&#x60;   |&#x60;False&#x60;     |None                                                                                                                               | |**Named Entity Recognition**|&#x60;language_detection&#x60;   |&#x60;False&#x60;-    |None                                                                                                                               | |**Language Detection**      |&#x60;language_detection&#x60;   |&#x60;False&#x60;     |None                                                                                                                               | |**Text to speech**          |&#x60;text_to_speech&#x60;       |&#x60;False&#x60;     |None                                                                                                                               | 
     * @param description The desciption field must be an array of ordered dictionaries.                                                      Each dictionary describes the feature to call. in fact, it has to contain two keys \&quot;feature\&quot; and \&quot;params\&quot;.   * feature conatins a string (the value of the feature ex : automatic_translation).  * params contains a dictionary of parameters to be used to call the feature, see the feature corresponding documentation to know which parameters well be needed.   ex : &#x60;[ { \&quot;feature\&quot;: \&quot;ocr\&quot;,  \&quot;params\&quot;: { \&quot;providers\&quot;: \&quot;[&#39;amazon&#39;]\&quot;,\&quot;language\&quot;: \&quot;en-US\&quot; } }, { \&quot;feature\&quot;: \&quot;syntax_analysis\&quot;,  \&quot;params\&quot;: { \&quot;providers\&quot;: \&quot;[&#39;amazon&#39;]\&quot;,\&quot;language\&quot;: \&quot;en-US\&quot; } }]&#x60;                                                       (required)
     * @param returnOnlyLast This parameter allows user to choose to output only the final result or all the intermediate results. (required)
     * @param text The input text for the first feature of the pipeline (optional)
     * @param files The input file for the first feature of the pipeline (optional)
     * @return ApiResponse&lt;InlineResponse200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse200> pipelinesWithHttpInfo(String description, Boolean returnOnlyLast, String text, File files) throws ApiException {
        com.squareup.okhttp.Call call = pipelinesValidateBeforeCall(description, returnOnlyLast, text, files, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Pipelines let you combine different AI APIs from different providers into a single ready to use pipeline that you can run on your data.   **AVAILABLE FEATURES**   |Feature                   |Value|Can be first|Can be followed by| |--------------------------|-----------------------|------------|------------------| |**OCR**                     |&#x60;ocr&#x60;                  |&#x60;True&#x60;      |Sentiment Analysis, Syntax Analysis, Keyword Analysis, Named Entity Recognition, Text to speech, Translation,  Language Detection  | |**Translation**             |&#x60;automatic_translation&#x60;|&#x60;True&#x60;      |Sentiment Analysis, Syntax Analysis, Keyword Analysis, Named Entity Recognition, Text to speech, Language Detection                | |**Speech recognition**      |&#x60;speech_to_text&#x60;       |&#x60;True&#x60;      |Sentiment Analysis, Syntax Analysis, Keyword Analysis, Named Entity Recognition, Text to speech, Translation,  Language Detection  | |**Sentiment Analysis**      |&#x60;sentiment_analysis&#x60;   |&#x60;False&#x60;     |None                                                                                                                               | |**Syntax Analysis**         |&#x60;syntax_analysis&#x60;      |&#x60;False&#x60;     |None                                                                                                                               | |**Keyword Analysis**        |&#x60;keyword_extraction&#x60;   |&#x60;False&#x60;     |None                                                                                                                               | |**Named Entity Recognition**|&#x60;language_detection&#x60;   |&#x60;False&#x60;-    |None                                                                                                                               | |**Language Detection**      |&#x60;language_detection&#x60;   |&#x60;False&#x60;     |None                                                                                                                               | |**Text to speech**          |&#x60;text_to_speech&#x60;       |&#x60;False&#x60;     |None                                                                                                                               | 
     * @param description The desciption field must be an array of ordered dictionaries.                                                      Each dictionary describes the feature to call. in fact, it has to contain two keys \&quot;feature\&quot; and \&quot;params\&quot;.   * feature conatins a string (the value of the feature ex : automatic_translation).  * params contains a dictionary of parameters to be used to call the feature, see the feature corresponding documentation to know which parameters well be needed.   ex : &#x60;[ { \&quot;feature\&quot;: \&quot;ocr\&quot;,  \&quot;params\&quot;: { \&quot;providers\&quot;: \&quot;[&#39;amazon&#39;]\&quot;,\&quot;language\&quot;: \&quot;en-US\&quot; } }, { \&quot;feature\&quot;: \&quot;syntax_analysis\&quot;,  \&quot;params\&quot;: { \&quot;providers\&quot;: \&quot;[&#39;amazon&#39;]\&quot;,\&quot;language\&quot;: \&quot;en-US\&quot; } }]&#x60;                                                       (required)
     * @param returnOnlyLast This parameter allows user to choose to output only the final result or all the intermediate results. (required)
     * @param text The input text for the first feature of the pipeline (optional)
     * @param files The input file for the first feature of the pipeline (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call pipelinesAsync(String description, Boolean returnOnlyLast, String text, File files, final ApiCallback<InlineResponse200> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = pipelinesValidateBeforeCall(description, returnOnlyLast, text, files, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse200>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
