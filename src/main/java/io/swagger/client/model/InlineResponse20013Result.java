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


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * object
 */
@ApiModel(description = "object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-13T08:49:08.469Z")
public class InlineResponse20013Result {
  @SerializedName("file_name")
  private String fileName = null;

  @SerializedName("labels")
  private List<String> labels = null;

  @SerializedName("confidences")
  private List<BigDecimal> confidences = null;

  @SerializedName("x_mins")
  private List<BigDecimal> xMins = null;

  @SerializedName("x_maxs")
  private List<BigDecimal> xMaxs = null;

  @SerializedName("y_mins")
  private List<BigDecimal> yMins = null;

  @SerializedName("y_maxs")
  private List<BigDecimal> yMaxs = null;

  public InlineResponse20013Result fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @ApiModelProperty(value = "")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public InlineResponse20013Result labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  public InlineResponse20013Result addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<String>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @ApiModelProperty(value = "")
  public List<String> getLabels() {
    return labels;
  }

  public void setLabels(List<String> labels) {
    this.labels = labels;
  }

  public InlineResponse20013Result confidences(List<BigDecimal> confidences) {
    this.confidences = confidences;
    return this;
  }

  public InlineResponse20013Result addConfidencesItem(BigDecimal confidencesItem) {
    if (this.confidences == null) {
      this.confidences = new ArrayList<BigDecimal>();
    }
    this.confidences.add(confidencesItem);
    return this;
  }

   /**
   * Get confidences
   * @return confidences
  **/
  @ApiModelProperty(value = "")
  public List<BigDecimal> getConfidences() {
    return confidences;
  }

  public void setConfidences(List<BigDecimal> confidences) {
    this.confidences = confidences;
  }

  public InlineResponse20013Result xMins(List<BigDecimal> xMins) {
    this.xMins = xMins;
    return this;
  }

  public InlineResponse20013Result addXMinsItem(BigDecimal xMinsItem) {
    if (this.xMins == null) {
      this.xMins = new ArrayList<BigDecimal>();
    }
    this.xMins.add(xMinsItem);
    return this;
  }

   /**
   * Get xMins
   * @return xMins
  **/
  @ApiModelProperty(value = "")
  public List<BigDecimal> getXMins() {
    return xMins;
  }

  public void setXMins(List<BigDecimal> xMins) {
    this.xMins = xMins;
  }

  public InlineResponse20013Result xMaxs(List<BigDecimal> xMaxs) {
    this.xMaxs = xMaxs;
    return this;
  }

  public InlineResponse20013Result addXMaxsItem(BigDecimal xMaxsItem) {
    if (this.xMaxs == null) {
      this.xMaxs = new ArrayList<BigDecimal>();
    }
    this.xMaxs.add(xMaxsItem);
    return this;
  }

   /**
   * Get xMaxs
   * @return xMaxs
  **/
  @ApiModelProperty(value = "")
  public List<BigDecimal> getXMaxs() {
    return xMaxs;
  }

  public void setXMaxs(List<BigDecimal> xMaxs) {
    this.xMaxs = xMaxs;
  }

  public InlineResponse20013Result yMins(List<BigDecimal> yMins) {
    this.yMins = yMins;
    return this;
  }

  public InlineResponse20013Result addYMinsItem(BigDecimal yMinsItem) {
    if (this.yMins == null) {
      this.yMins = new ArrayList<BigDecimal>();
    }
    this.yMins.add(yMinsItem);
    return this;
  }

   /**
   * Get yMins
   * @return yMins
  **/
  @ApiModelProperty(value = "")
  public List<BigDecimal> getYMins() {
    return yMins;
  }

  public void setYMins(List<BigDecimal> yMins) {
    this.yMins = yMins;
  }

  public InlineResponse20013Result yMaxs(List<BigDecimal> yMaxs) {
    this.yMaxs = yMaxs;
    return this;
  }

  public InlineResponse20013Result addYMaxsItem(BigDecimal yMaxsItem) {
    if (this.yMaxs == null) {
      this.yMaxs = new ArrayList<BigDecimal>();
    }
    this.yMaxs.add(yMaxsItem);
    return this;
  }

   /**
   * Get yMaxs
   * @return yMaxs
  **/
  @ApiModelProperty(value = "")
  public List<BigDecimal> getYMaxs() {
    return yMaxs;
  }

  public void setYMaxs(List<BigDecimal> yMaxs) {
    this.yMaxs = yMaxs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20013Result inlineResponse20013Result = (InlineResponse20013Result) o;
    return Objects.equals(this.fileName, inlineResponse20013Result.fileName) &&
        Objects.equals(this.labels, inlineResponse20013Result.labels) &&
        Objects.equals(this.confidences, inlineResponse20013Result.confidences) &&
        Objects.equals(this.xMins, inlineResponse20013Result.xMins) &&
        Objects.equals(this.xMaxs, inlineResponse20013Result.xMaxs) &&
        Objects.equals(this.yMins, inlineResponse20013Result.yMins) &&
        Objects.equals(this.yMaxs, inlineResponse20013Result.yMaxs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, labels, confidences, xMins, xMaxs, yMins, yMaxs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20013Result {\n");
    
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    confidences: ").append(toIndentedString(confidences)).append("\n");
    sb.append("    xMins: ").append(toIndentedString(xMins)).append("\n");
    sb.append("    xMaxs: ").append(toIndentedString(xMaxs)).append("\n");
    sb.append("    yMins: ").append(toIndentedString(yMins)).append("\n");
    sb.append("    yMaxs: ").append(toIndentedString(yMaxs)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
