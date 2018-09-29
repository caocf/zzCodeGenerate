<style>

</style>
<template>
    <div>

        <div style="height: 400px;overflow: auto">
            <block-head title="基本信息" v-if="formValidate.id">
                <div slot="toolbar">
                    <Button type="info" v-show="!isEdit  @click="toogleEdit" size="small">编辑</Button>
                    <Button v-show="isEdit" type="primary" @click="save" size="small">保存</Button>
                    <Button v-show="isEdit" @click="handleReset('formValidate')" size="small">重置</Button>
                    <Button type="warning" v-show="isEdit" @click="toogleCancel" size="small">取消</Button>

                </div>
            </block-head>

        <Form v-show="!isEdit"  :label-width="labelWidth">
        <#list showColumnPages as page>
            <#if (page_index==0)>
            <Row style="padding : 10px ">
            </#if>

            <#if (page.existPage == '1' &&  page.editable == '0')>
                <#if page.hiddenable == '0'>
                    <Col :xs="24" :sm="12" :md="12" :lg="12">
                    <FormItem label="${page.columnComment}">
                        <#if page.element == 'date' >
                            {{ formValidate.${page.javaName} | date('%Y-%m-%d') }}
                        <#elseif  page.element == 'timestamp' >
                            {{ formValidate.${page.javaName} | date('%Y-%m-%d %H:%M:%S') }}
                        <#else >
                            {{ formValidate.${page.javaName} }}
                        </#if >
                    </FormItem>
                    </Col>
                </#if>
            <#elseif (page.existPage == '1' && page.editable == '1')>

                <#if (page.element == 'textarea' || page.element == 'singlefile' || page.element == 'multifile' || page.element == 'singleimage' || page.element == 'multiimage' ) >
                    <Col :xs="24" :sm="24" :md="24" :lg="24">
                <#else >
                    <Col :xs="24" :sm="12" :md="12" :lg="12">
                </#if>


                <FormItem label="${page.columnComment}" prop="${page.javaName}">
                    <#if page?exists && page.columnConfig?exists>
                        <#if page.element == 'input' >
                            {{formValidate.${page.columnConfig.javaName}}}
                        <#elseif page.element == 'digits' >
                            {{formValidate.${page.columnConfig.javaName}}}
                        <#elseif page.element == 'number' >
                            {{formValidate.${page.columnConfig.javaName}}}
                        <#elseif page.element == 'date' >
                            {{formValidate.${page.columnConfig.javaName}}}
                        <#elseif page.element == 'timestamp' >
                            {{formValidate.${page.columnConfig.javaName}}}
                        <#elseif page.element == 'email' >
                            {{formValidate.${page.columnConfig.javaName}}}
                        <#elseif page.element == 'url' >
                            {{formValidate.${page.columnConfig.javaName}}}
                        <#elseif page.element == 'radio' >


                        <#elseif page.element == 'checkbox' >


                        <#elseif page.element == 'select' >


                        <#elseif page.element == 'openwin' >



                        <#elseif page.element == 'singlefile' >
                            <${page.columnConfig.javaName}Upload :businessType.sync="formValidate.${page.columnConfig.javaName}" :action="uploadApi"  :fileSize="1" :format="uploadFormat" :multiple='singleFile' :max-size="uploadMaxSize"  name="file" :data="uploadParams" :defaultFileList="${page.columnConfig.javaName}FileList"/>
                        <#elseif page.element == 'multifile' >
                            <${page.columnConfig.javaName}Upload :businessType.sync="formValidate.${page.columnConfig.javaName}" :action="uploadApi"  :format="uploadFormat" :multiple='multipleFile' :max-size="uploadMaxSize"  name="file" :data="uploadParams" :defaultFileList="${page.columnConfig.javaName}FileList"/>
                        <#elseif page.element == 'singleimage' >

                        <#elseif page.element == 'multiimage' >

                        <#else >
                            {{formValidate.${page.columnConfig.javaName}}}
                        </#if>
                    <#elseif page?exists && page.exColumn?exists>
                        <#if page.element != 'openwin' >
                            {{formValidate.${page.exColumn.originalColumn.fkTableConfig.javaName}}}
                        </#if>
                    <#else>
                        //todo 生成编辑界面错误， columnPage 应该没有这种情况
                    ${page.id}
                    </#if>
                </FormItem>
                </Col>
            </#if>

            <#if (!page_has_next)>
            </Row>
            </#if>
        </#list>
        </Form>


        <Form ref="formValidate" v-show="isEdit" :model="formValidate" :rules="ruleValidate" :label-width="labelWidth">

        <#list showColumnPages as page>
            <#if (page_index==0)>
            <Row style="padding : 10px ">
            </#if>

            <#if (page.existPage == '1' &&  page.editable == '0')>
                <#if page.hiddenable == '0'>
                    <Col :xs="24" :sm="12" :md="12" :lg="12">
                    <FormItem label="${page.columnComment}" prop="${page.javaName}">
                        <#if page.element == 'date' >
                            {{ formValidate.${page.javaName} | date('%Y-%m-%d') }}
                        <#elseif  page.element == 'timestamp' >
                            {{ formValidate.${page.javaName} | date('%Y-%m-%d %H:%M:%S') }}
                        <#else >
                            {{ formValidate.${page.javaName} }}
                        </#if >
                    </FormItem>
                    </Col>
                </#if>
            <#elseif (page.existPage == '1' && page.editable == '1')>

                <#if (page.element == 'textarea' || page.element == 'singlefile' || page.element == 'multifile' || page.element == 'singleimage' || page.element == 'multiimage' ) >
                    <Col :xs="24" :sm="24" :md="24" :lg="24">
                <#else >
                    <Col :xs="24" :sm="12" :md="12" :lg="12">
                </#if>


                <FormItem label="${page.columnComment}" prop="${page.javaName}">
                    <#if page?exists && page.columnConfig?exists>
                        <#if page.element == 'input' >
                            <Input type="text" v-model="formValidate.${page.columnConfig.javaName}" step="1" precision="0"
                                   <#if page.maxlength ?exists && page.maxlength != 0>maxlength="${page.maxlength}" </#if>
                                   <#if page.minlength ?exists && page.minlength != 0>maxlength="${page.minlength}" </#if>
                                <#if page.events?exists>
                                    <#list page.events as event>
                                   @${event.eventName}="${event.funcName}"
                                    </#list>
                                </#if>
                            />
                        <#elseif page.element == 'digits' >
                            <InputNumber  v-model="formValidate.${page.columnConfig.javaName}"
                                          <#if page.min?exists && page.min != 0>min="${page.min}"</#if> <#if page.max?exists && page.max != 0>max="${page.max}"</#if>

                                <#if page.events?exists>
                                    <#list page.events as event>
                                          @${event.eventName}="${event.funcName}"
                                    </#list>
                                </#if>
                            />
                        <#elseif page.element == 'number' >
                            <InputNumber  v-model="formValidate.${page.columnConfig.javaName}"  precision="2"
                                          <#if page.min?exists && page.min != 0>min="${page.min}"</#if> <#if page.max?exists && page.max != 0>max="${page.max}"</#if>

                                <#if page.events?exists>
                                    <#list page.events as event>
                                          @${event.eventName}="${event.funcName}"
                                    </#list>
                                </#if>
                            />
                        <#elseif page.element == 'date' >
                            <DatePicker type="date"   v-model="formValidate.${page.columnConfig.javaName}"  clearable :editable="false" @on-change="onChange${page.columnConfig.javaName?cap_first}"
                                <#if page.events?exists>
                                    <#list page.events as event>
                                        @${event.eventName}="${event.funcName}"
                                    </#list>
                                </#if>
                            />
                        <#elseif page.element == 'timestamp' >
                            <DatePicker type="datetime"   v-model="formValidate.${page.columnConfig.javaName}"  clearable :editable="false" @on-change="onChange${page.columnConfig.javaName?cap_first}"
                                <#if page.events?exists>
                                    <#list page.events as event>
                                        @${event.eventName}="${event.funcName}"
                                    </#list>
                                </#if>
                            />
                        <#elseif page.element == 'email' >
                            <Input type="email" v-model="formValidate.${page.columnConfig.javaName}"
                                   <#if page.maxlength ?exists && page.maxlength != 0>maxlength="${page.maxlength}" </#if>
                                   <#if page.minlength ?exists && page.minlength != 0>maxlength="${page.minlength}" </#if>
                                <#if page.events?exists>
                                    <#list page.events as event>
                                   @${event.eventName}="${event.funcName}"
                                    </#list>
                                </#if>  />
                        <#elseif page.element == 'url' >
                            <Input type="url" v-model="formValidate.${page.columnConfig.javaName}"
                                   <#if page.maxlength ?exists && page.maxlength != 0>maxlength="${page.maxlength}" </#if>
                                   <#if page.minlength ?exists && page.minlength != 0>maxlength="${page.minlength}" </#if>
                                <#if page.events?exists>
                                    <#list page.events as event>
                                   @${event.eventName}="${event.funcName}"
                                    </#list>
                                </#if>  />

                        <#elseif page.element == 'radio' >
                            <RadioGroup v-model="formValidate.${page.columnConfig.javaName}">
                                <Radio v-for="(item, index) in ${page.columnConfig.dictType}Dict" :label="item.dictVal" :key="item.dictVal">
                                    <span>{{item.dictName}}</span>
                                </Radio>
                            </RadioGroup>

                        <#elseif page.element == 'checkbox' >
                            <CheckboxGroup  v-model="formValidate.${page.columnConfig.javaName}">
                                <Checkbox  v-for="(item, index) in ${page.columnConfig.dictType}Dict" :label="item.dictVal" :key="item.dictVal">
                                    <span>{{item.dictName}}</span>
                                </Checkbox >
                            </CheckboxGroup >



                        <#elseif page.element == 'select' >
                            <Select v-model="formValidate.${page.columnConfig.javaName}"
                                <#if page.events?exists>
                                    <#list page.events as event>
                                    @${event.eventName}="${event.funcName}"
                                    </#list>
                                </#if>
                            >
                                <#if page.required == '0'>
                                    <Option value=""></Option>
                                </#if>
                                <Option v-for="(item, index) in ${page.columnConfig.dictType}Dict" :value="item.dictVal" :key="item.dictVal" >{{item.dictName}}</Option>
                            </Select>

                        <#elseif page.element == 'openwin' >
                            <Input v-model="formValidate.${page.columnConfig.javaName}Name"       @on-focus="select_${page.columnConfig.javaName}_${page.columnConfig.originalColumn.fkTableConfig.javaName}"/>




                        <#elseif page.element == 'singlefile' >
                            <${page.columnConfig.javaName}Upload :businessType.sync="formValidate.${page.columnConfig.javaName}" :action="uploadApi"  :fileSize="1" :format="uploadFormat" :multiple='singleFile' :max-size="uploadMaxSize"  name="file" :data="uploadParams" :defaultFileList="${page.columnConfig.javaName}FileList"/>
                        <#elseif page.element == 'multifile' >
                            <${page.columnConfig.javaName}Upload :businessType.sync="formValidate.${page.columnConfig.javaName}" :action="uploadApi"  :format="uploadFormat" :multiple='multipleFile' :max-size="uploadMaxSize"  name="file" :data="uploadParams" :defaultFileList="${page.columnConfig.javaName}FileList"/>
                        <#elseif page.element == 'singleimage' >

                        <#elseif page.element == 'multiimage' >

                        <#else >
                            <Input type="text" v-model="formValidate.${page.columnConfig.javaName}"
                                <#if page.events?exists>
                                    <#list page.events as event>
                                   @${event.eventName}="${event.funcName}"
                                    </#list>
                                </#if>
                            />
                        </#if>
                    <#elseif page?exists && page.exColumn?exists>
                        <#if page.element == 'openwin' >
                            <Input v-model="formValidate.${page.exColumn.javaName}"       @on-focus="select_${page.exColumn.javaName}_${page.exColumn.originalColumn.fkTableConfig.javaName}"/>
                        </#if>
                    <#else>
                        //todo 生成编辑界面错误， columnPage 应该没有这种情况
                    ${page.id}
                    </#if>
                </FormItem>
                </Col>
            </#if>

            <#if (!page_has_next)>
            </Row>
            </#if>
        </#list>
        </Form>


        <Row type="flex" justify="center" v-if="!formValidate.id">
            <Col span="24" style="text-align: right;padding-right: 20px;border-top: solid 1px #dddddd;height: 40px;line-height: 40px;">

            <Button type="primary" @click="save">保存</Button>
            <Button @click="handleReset('formValidate')" style="margin-left: 8px">重置</Button>
            </Col>
        </Row>


    <#list fkTables as fkTable>

        <#if fkTable.isBuildUi == '1'>
            <${fkTable.javaName}Search modalTitle="选择${fkTable.tableComment}" :display="select${fkTable.javaName}Display" :businessType="bsType" @closeDialog="closeDialog('select${fkTable.javaName}')"
                <#list fks[fkTable.fullResourceFile] as field >
                                       @on-selected-${field.javaName}="selected${field.javaName}Callback"
                </#list>
            />
        </#if>

    </#list>

    </div>

</template>


<script>

    import dialog from '@/utils/dialog'
    import baseForm from '@/mixins/baseForm';
    import commonApi from '@/api/commonApi';
    import ${table.javaName}Api from '@/api/${table.fullResourceFile}/${table.javaName}Api' ;
    import fileUpload from '@/components/file-upload/file-upload';
    import blockHead from '@/components/block-head/block-head';


    <#list fkTables as fkTable>
        <#if fkTable.isBuildUi == '1'>
        import ${fkTable.javaName}Search from '@/views${fkTable.fullResourceName}/${fkTable.javaName}Search';
        </#if>
    </#list>

    export default {
        mixins:[baseForm],
        components: {
        blockHead,
        fileUpload,
        <#list showColumnPages as page>
            <#if (page.editable == '1' && page.columnConfig?exists && (page.element == 'singlefile' || page.element == 'multifile') )>
                ${page.columnConfig.javaName}Upload :fileUpload,
            </#if>
        </#list>


        <#list fkTables as fkTable>
            <#if fkTable.isBuildUi == '1'>
                ${fkTable.javaName}Search ,
            </#if>
        </#list>


        },



    props:{

        <#list columns as column>
        <#if column.columnIsfk == '1'>
        ${column.javaName} :{
            type:String,
            default:''
        },
        </#if>
        </#list>
        id :{
            type:String,
            default:''
        }


    },

    watch: {

        <#list columns as column>
        <#if column.columnIsfk == '1'>
        ${column.javaName} : function (newVal, oldVal) {
            this.findList();
        },
        </#if>
        </#list>

        id: function (newVal, oldVal) {
            this.findList();
        },

        ${table.simpleName}Id: function (newVal, oldVal) {
            this.findList();
        }

    },


        data () {
            return {

                multipleFile:true,
                singleFile:false,
                fks:{
        <#list table.fkColumns as fkColumn>
        ${fkColumn.javaName}:'',
        </#list>
        },

        <#list showColumnPages as page>
            <#if (page.editable == '1' && page.columnConfig?exists && (page.element == 'singlefile' || page.element == 'multifile') )>
            ${page.columnConfig.javaName}FileList :[],
            </#if>
        </#list>

                width:500,
                    bsType: '',
                    maskClosable: false,
                    formValidate: {
            <#list columnPages as page>
                <#if page.existPage == '1'>
                ${page.javaName}:'',
                </#if>
            </#list>
            },

        <#list fkTables as fkTable>
                select${fkTable.javaName}Display: false,
        </#list>

        <#list dictSet as dictPage>
            <#if dictPage.exColumn?exists>${dictPage.exColumn.dictType}Dict:{},
            <#else>${dictPage.columnConfig.dictType}Dict:[],
            </#if>
        </#list>
                ruleValidate: {

            <#list columnPages as page>
                <#if page.existPage == '1' && page.editable == '1' >
                    <#if page.required == '1' || page.validates?exists>
                    ${page.javaName}:[


                        <#if page.validates?exists>
                            <#list  page.validates as validate>
                                <#if page.element == 'select' >
                                    { type: 'string', message: '${validate.msg}', trigger: 'change', pattern: ${validate.rex} },
                                <#elseif  page.element == 'radio' >
                                    {  type: 'array',  message: '${validate.msg}', trigger: 'change', pattern: ${validate.rex} },
                                <#elseif  page.element == 'checkbox' >
                                    {  type: 'array',  message: '${validate.msg}', trigger: 'change', pattern: ${validate.rex} },
                                <#elseif  page.element == 'openwin' >
                                    { type: 'string', message: '${validate.msg}', trigger: 'blur', pattern: ${validate.rex} },
                                <#elseif  page.element == 'date' || page.element == 'timestamp'>
                                    { type: 'date', message: '${validate.msg}', trigger: 'blur', pattern: ${validate.rex} },
                                <#else>
                                    { type: 'string', message: '${validate.msg}', trigger: 'blur', pattern: ${validate.rex} },
                                </#if>
                            </#list>
                        </#if>

                        <#if page.required == '1'>
                            <#if page.element == 'select' >
                                { required: true,  message: '请选择${page.columnComment}', trigger: 'change' }
                            <#elseif  page.element == 'radio' >
                                { required: true, type: 'array', min: 1, message: '请选择${page.columnComment}', trigger: 'change' }
                            <#elseif  page.element == 'checkbox' >
                                { required: true, type: 'array', min: 1, message: '请至少选择一项${page.columnComment}', trigger: 'change' }
                            <#elseif  page.element == 'openwin' >
                                { required: true,  message: '请选择${page.columnComment}', trigger: 'blur' }
                            <#elseif  page.element == 'date' || page.element == 'timestamp'>
                                { required: true,  type: 'date',message: '请选择${page.columnComment}', trigger: 'blur' }
                            <#else>
                                { required: true, message: '请输入${page.columnComment}', trigger: 'blur' }
                            </#if>
                        </#if>

                    ],
                    </#if>
                </#if>
            </#list>

            },


        };
        },
    methods: {


    <#list showColumnPages as page>

        <#if (page.existPage == '1' && page.editable == '1' && page.element == 'date')>
            onChange${page.columnConfig.javaName?cap_first}(v){
                this.formValidate.${page.columnConfig.javaName} = new Date(v);
            },

        <#elseif (page.existPage == '1' && page.editable == '1' && page.element == 'timestamp')>
            onChange${page.columnConfig.javaName?cap_first}(v){
                this.formValidate.${page.columnConfig.javaName} = new Date(v);
            },
        </#if>
    </#list>

    <#list columnEvents as event>
    ${event.funcBody},
    </#list>

    <#list fks?values as fkList >
        <#list fkList as page >
            selected${page.javaName}Callback(selection){
                <#if page.exColumn?exists>
                    this.formValidate.${page.exColumn.originalColumn.javaName} = selection.id;
                    this.formValidate.${page.javaName} = selection.${page.exColumn.fkJavaName};
                <#else >
                    this.formValidate.${page.columnConfig.originalColumn.javaName} = selection.id;
                    this.formValidate.${page.javaName} = selection.${page.columnConfig.fkJavaName};
                </#if>
                this.select${page.exColumn.originalColumn.fkTableConfig.javaName}Display = false ;

            },
        </#list>
    </#list>


    <#list columnPages as columnPage>
        <#if columnPage?exists && columnPage.element == 'openwin' >
            <#if columnPage.columnConfig?exists>
            <#elseif  columnPage.exColumn?exists>
                select_${columnPage.exColumn.javaName}_${columnPage.exColumn.originalColumn.fkTableConfig.javaName}(){
                    this.bsType='${columnPage.javaName}';
                    this.select${columnPage.exColumn.originalColumn.fkTableConfig.javaName}Display = true ;
                },
            </#if>
        </#if>
    </#list>


        save() {
            this.handleSubmit('formValidate');
            if ((this.formValid)) {
                let that = this;
                if (this.id != '') {
                    this.formValidate.id = this.id;
                    ${table.javaName}Api.update(this.formValidate,{
                        onSuccess(body){
                            that.handleReset('formValidate');
                            that.$emit('saveSuccess');
                            dialog.success(body.msg,that);
                        }
                    });


                } else {
                    ${table.javaName}Api.add(this.formValidate,{
                        onSuccess(body){
                            that.handleReset('formValidate');
                            that.$emit('saveSuccess');
                            dialog.success(body.msg,that);
                        }
                    });

                }
            }
        },
        findById() {
            let that = this;
            ${table.javaName}Api.detail(this.id,{
                onSuccess(body){
                    that.formValidate = body["${table.javaName?uncap_first}"];
                }
            });

        },

        findBy() {
            let that = this;
            ${table.javaName}Api.detailBy(that.param,{
                onSuccess(body){
                    that.formValidate = body["${table.javaName?uncap_first}"];
                }
            });

        }

    },
    mounted() {

        this.$nextTick(function () {
            let that = this;


        <#if dictSet?exists && (dictSet?size > 0) >
            commonApi.allDicts('<#list dictSet as columnPage><#if columnPage.exColumn?exists>${columnPage.exColumn.dictType}<#if columnPage_has_next>,</#if><#else>${columnPage.columnConfig.dictType}<#if columnPage_has_next>,</#if></#if></#list>', {
                onSuccess(dictMap){
                    <#list dictSet as dictPage>
                        <#if dictPage.exColumn?exists>that.${dictPage.exColumn.dictType}Dict=dictMap["${dictPage.exColumn.dictType}"]<#if dictPage_has_next>,</#if>
                        <#else>that.${dictPage.columnConfig.dictType}Dict=dictMap["${dictPage.columnConfig.dictType}"]<#if dictPage_has_next>;</#if>
                        </#if>
                    </#list>
                }
            });
        </#if>

            that.findBy();
        });
    }


    };
</script>
