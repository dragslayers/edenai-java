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

import java.io.File;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AutoMlTextDataApi
 */
@Ignore
public class AutoMlTextDataApiTest {

    private final AutoMlTextDataApi api = new AutoMlTextDataApi();

    
    /**
     * 
     *
     * AutoML Text Data Delete
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void automlTextDataDeleteTest() throws Exception {
        String projectId = null;
        String trainId = null;
        api.automlTextDataDelete(projectId, trainId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     *   **SUPPORTED FILES**  The API takes a csv file with no header and only one column, where each line contains a document to classify.  
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void automlTextDataLaunchPredictionTest() throws Exception {
        String projectId = null;
        String trainId = null;
        File files = null;
        api.automlTextDataLaunchPrediction(projectId, trainId, files);

        // TODO: test validations
    }
    
    /**
     * 
     *
     *   **SUPPORTED FILES**  The API takes a csv file with no header and only one column, where each line contains a document to classify.  
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void automlTextDataPredictionDetailTest() throws Exception {
        String predictId = null;
        String projectId = null;
        String trainId = null;
        api.automlTextDataPredictionDetail(predictId, projectId, trainId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     *   **SUPPORTED FILES**  The API takes a csv file with no header and only one column, where each line contains a document to classify.  
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void automlTextDataPredictionResultsTest() throws Exception {
        String predictId = null;
        String projectId = null;
        String trainId = null;
        api.automlTextDataPredictionResults(predictId, projectId, trainId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     *   **AVAILABLE PROVIDERS**  |Name|Value| |-------------------------------|---------------| |[**Google Cloud Services**](https://www.edenai.co/catalog/google-cloud-natural-language)|&#x60;google&#x60;| |[**Amazon Web Services**](https://www.edenai.co/catalog/amazon-comprehend)|&#x60;amazon&#x60;|  
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void automlTextDataTrainTest() throws Exception {
        String projectId = null;
        String provider = null;
        String trainingName = null;
        api.automlTextDataTrain(projectId, provider, trainingName);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * AutoML Text Data Train Detail
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void automlTextDataTrainDetailTest() throws Exception {
        String projectId = null;
        String trainId = null;
        api.automlTextDataTrainDetail(projectId, trainId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     *   **SUPPORTED FILES**  The API takes csv files separated using &#39;,&#39;. The csv must contain a header and exactly two columns, named &#x60;docs&#x60; and &#x60;labels&#x60; In case a document might have several labels, please separate your labels using &#39;|&#39;     **SUPPORTED LANGUAGE**  |Name|Type|Value| |---------------------------|-------------------------------|---------------| | **English (US)**|*&#x60;string&#x60;*|&#x60;en&#x60;| | **French**      |*&#x60;string&#x60;*|&#x60;fr&#x60;| | **German**      |*&#x60;string&#x60;*|&#x60;de&#x60;| | **Italian**     |*&#x60;string&#x60;*|&#x60;it&#x60;| | **Portuguese**  |*&#x60;string&#x60;*|&#x60;pt&#x60;| | **Arabic**      |*&#x60;string&#x60;*|&#x60;ar&#x60;| | **Chinese-Simplified**|*&#x60;string&#x60;*|&#x60;zh&#x60;| | **Chinese-Traditional**|*&#x60;string&#x60;*|&#x60;zh-TW&#x60;| | **Korean**      |*&#x60;string&#x60;*|&#x60;ko&#x60;| | **Japanese**    |*&#x60;string&#x60;*|&#x60;ja&#x60;| | **Hindi**       |*&#x60;string&#x60;*|&#x60;hi&#x60;| | **Spanish**     |*&#x60;string&#x60;*|&#x60;es&#x60;|    **AVAILABLE CLASSIFICATION TYPES**  |Type|Value|Description| |---------------------------|-------------------------------|---------------| | **Single Label Classification**|&#x60;single_label_classification&#x60;|Each document belongs to one category (label)| | **Multi Label Classification**|&#x60;multi_label_classification&#x60;|Documents might have several labels|  
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void automlTextProjectCreateTest() throws Exception {
        String projectName = null;
        String projectDescription = null;
        File files = null;
        String type = null;
        String language = null;
        api.automlTextProjectCreate(projectName, projectDescription, files, type, language);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * AutoML Text Project Delete
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void automlTextProjectDeleteTest() throws Exception {
        String projectId = null;
        api.automlTextProjectDelete(projectId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * AutoML Text Project Detail
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void automlTextProjectDetailTest() throws Exception {
        String projectId = null;
        api.automlTextProjectDetail(projectId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * AutoML Text Project List
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void automlTextProjectListTest() throws Exception {
        api.automlTextProjectList();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * AutoML Text Project Update
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void automlTextProjectUpdateTest() throws Exception {
        String projectId = null;
        String projectName = null;
        String projectDescription = null;
        String type = null;
        String language = null;
        api.automlTextProjectUpdate(projectId, projectName, projectDescription, type, language);

        // TODO: test validations
    }
    
}