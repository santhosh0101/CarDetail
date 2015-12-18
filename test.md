# **Merge Field Functionality**

### **What are Merge Fields?**

Merge Fields incorporates values from a record. The record can be a contact, deal, calendar etc. It can be used in multiple places like Email Templates, campaign nodes. <u> For example, you can place a merge</u> field in a Email Template to include the recipient name. This makes the Email personal to the recipient.

    Ex:- Dear {{first_name}} {{last_name}}

![Figure 1-1](fig.png "Figure 1-1")

In above screenshot “first_name” Merge Field is used for sending a mail with greeting. When the mail will be sent then the recipient’s first name is retrieved and is inserted in place of the merge field.

### **Syntax of Merge Fields:**

 {{field name}} or {{{field name}}}

If merge field data contain any special character or escape sequence then use three curly braces else use two curly braces syntax. **Merge field name are case sensitive (fisrt_name not equal to First_name).** We can also use merge fields for custom fields created by user. Merge Field feature provide special operation on some field,  for example they provide manipulated data for first name, last name, etc. Merge Fields work across different entities like Contacts, Deals,Calendar etc.

## **Detailed list of Entities and Properties:**
The detailed list of entities and the properties along with the description and example are mentioned below.
## **1. <u>Contacts**

| <center><u><span style="font-size:16px;">Merge Fields      |  <center><u><span style="font-size:16px;">Description             |    <center><u><span style="font-size:16px;">Example </span>          |
|:------------------|:-------------------------|:---------------------|
|{{first_name}}    |It returns first name of contact person.| michel → michel<br>Michel→ Michel <br>A B dev→ A B dev|
|{{last_name}}|It returns last name of contact person.| clark → clark<br>WarNer→ WarNer<br>James Bond→ James bond |
|{{first_name_fix}}|This merge field converts first letter of the first name in uppercase. If first name having two words separated by space then it returns only first word.|michel → Michel micHEl→ MicHEl<br>david Warner → David|
|{{last_name_fix}}|This merge field converts first letter of last name in uppercase. If last name having two words separated by space then it returns only first word.|clark → Clark<br>WarNer→ WarNer<br>James Bond→ James|
|{{name_fix}}|This merge field concat first word of first name and first word of last name separated by space  and converts both name first letter in uppercase and remaining letter will be as it is.|david warner- David Warner<br>dAvid wArner- DAvid WArner<br>If first name=”abraham Benjamin”last name=”de villiers” then output is : “abraham De”|
|{{score}}|It returns integer value of score.| |
|{{email}}|This merge field returns latest email id of contact person.|michel_clark@gmail.com|
|{{email_work}}|This merge field returns work email id of contact person.| |
 |{{email_home}}|This merge field returns personal email id of contact person.|  |
 |{{company}}| This merge field returns Company name.| Agile CRM|
|{{title}}|This merge will field return job description or title.|Software Developer<br>Project Manager|
|{{website}}|This merge field returns latest updated website address|https://www.agilecrm.com|
|{{created_date}}|This merge field returns date of contact created in MM/DD/YYYY format.|11/30/2015
|{{modified_date}}|This merge field returns last modified date of contact in MM/DD/YYYY format.|12/10/2015
|{{phone}}|This merge field returns latest updated phone number.| |
|{{phone_work}}|This merge field returns work phone number. | |
|{{phone_home}}|This merge field returns personal contact number.| |
|{{phone_other}}|This merge field returns other field phone number.| |
|{{phone_mobile}}|This merge field returns mobile  number.| |
|{{phone_main}}|This merge field returns main contact number.| |
|{{phone_home_fax}}|This merge field returns home fax number.| |
|{{phone_work_fax}}|This merge field returns work fax number.| |
|{{location.city}}|This merge field returns City name from contact address.|Sunnyvale|
|{{location.state}}|This merge field returns State name from contact address.|California|
|{{location.country}}|This merge field returns Country name from contact address in coded form.|e.g. India- IN<br>United State-US|
|{{location.zip}}|This merge field returns ZIP code or postal code from address.|500000|
|{{twitter_id}}|This merge field returns twitter id.| [@agilecrm](https://twitter.com/@agilecrm)|
|{{linkedin_id}}|This merge field returns Linkedin profile id.| |
|{{owner.name}}|This merge field returns owner name .| Agile CRM|
|{{owner.email}}|This merge field returns owner email id.|care@agilecrm.com|
|{{owner.calendar_url}}|This merge field returns owner calender url address| |
|{{{owner.signature}}}| | |
|{{{unsubscribe_link}}}|This merge field returns a link to  unsubscribe by clicking on which user can unsubscribe for the services.|https://michel.agilecrm.com/unsubscribe?sid=5709436928655360|
|{{{online_link}}}|This merge field returns online link. It’s only work for HTML not for TextBox.|
|{{{powered_by}}}|This merge field returns name of powerd by and name of powered by with link. It’s work only  for HTML.|Powered by [Agile](https://www.agilecrm.com/)|
|{{custom field}}|Description is given below..| |

<span style="font-size:15px;">**{{Custom field}}-**</span>  Custom field returns the value from custom field which is created by owner. When owner creates a custom field and provide name or label of custom field along with type (Text, TextArea, Date, List, CheckBox, Number, Formula). Merge Fields work on the custom fields. Just place the Custom Field Name in the syntax and you can retrieve the custom field data. This custom field should match exactly  with the database name and it is **case sensitive.**

    For e.g. If my custom field name is “PAN” then merge field is {{PAN}}

If we have custom field type is a check box then merge field returns on or off value. And if have custom field type is a Date then merge field returns date in (<span style="color:orange;">MM/DD/YYYY</span>) format.

## **2.<u> Deals**

| <center><u><span style="font-size:16px;">Merge Fields      |  <center><u><span style="font-size:16px;">Description             |    <center><u><span style="font-size:16px;">Example           |
|:-----------------------------|:------------------------------------|:---------------------|
|{{deal.name}}|This merge field returns name of the deal.|Test|
|{{deal.owner.name}}|This merge field returns name of the deal owner.|john|
|{{deal.owner.email}}|This merge field returns email id of the deal owner.|john@agilecrm.com|
|{{deal.close_date}}|This merge field returns closing date of deal in (MM/DD/YYYY) format.|11/23/2016|
|{{deal.created_time}}|This merge field returns created date of deal in (MM/DD/YYYY) format.|11/23/2015|
|{{deal.milestone}}|This merge field returns Milestone of deal.|New/Won/Lost|
|{{deal.description}}|This merge field returns Description of the deal.| |
|{{deal.expected_value}}|This merge field returns Value of deal.| |
|{{deal.probability}}|This merge field returns probability of deal.|Integer value range between 0 to 100|
|{{deal.old_milestone}}|This merge field returns name of old milestone. If deal milestone will be changed.|New/Won/Lost|
|{{deal.milestone_changed_time_string}}|This merge field returns in which date and time milestone changed.|12 Dec, 10:15|
|{{deal.custom_data.fieldname}}|Description is Given below..|  | |
<span style="font-size:15px;">**{{deal.custom_data.fieldname}}-**</span> Custom field returns the value from custom field which is created by owner. When owner creates a custom field and provide name or label of custom field along with type (Text, TextArea, Date, List, CheckBox, Number, Formula). Merge Fields work on the custom fields. Just place the Custom Field Name in the syntax and you can retrieve the custom field data. This custom field should match exactly  with the database name and it is case sensitive.
<br>    For e.g. If my custom field name is **“Currency”** then merge field is

    {{deal.custom_data.Currency}}

If we have custom field type is a check box then merge field returns on or off value. And if have custom field type is a Date then merge field returns date in (<span style="color:orange;">MM/DD/YYYY</span>) format.

## **3. <u>Calendar Event**

| <center><u><span style="font-size:16px;">Merge Fields      |  <center><u><span style="font-size:16px;">Description             |    <center><u><span style="font-size:16px;">Example           |
|:-----------------------------|:------------------------------------|:---------------------|
|{{event.title}}|This merge field returns name of the Event.|Happy New Year|
|{{event.allDay}}|This merge field returns true or false value. If event will be full day then it returns true otherwise it returns false.|<span style="color:orange;"> true </span>/ <span style="color:orange;">false</span>|
|{{event.description}}|This merge field returns description of the event.| |
|{{event.owner.name}}|This merge field returns name of the event owner.| |
|{{event.owner.email}}|This merge field returns email id of the event owner. || |
