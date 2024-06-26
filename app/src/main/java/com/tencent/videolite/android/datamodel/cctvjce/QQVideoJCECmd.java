package com.tencent.videolite.android.datamodel.cctvjce;

import java.io.Serializable;

public final class QQVideoJCECmd implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int _BindCellphone = 24736;
    public static final int _CheckBindReadForward = 24869;
    public static final int _CheckBindReadReverse = 24870;
    public static final int _CheckCode = 24681;
    public static final int _GetCode = 24680;
    public static final int _NewGetTicket = 60788;
    public static final int _NewLogin = 59986;
    public static final int _NewLogout = 59988;
    public static final int _NewRefreshToken = 59987;
    private String __T;
    private int __value;
    private static QQVideoJCECmd[] __values = new QQVideoJCECmd[195];
    public static final int _StGuidGet = 24865;
    public static final QQVideoJCECmd StGuidGet = new QQVideoJCECmd(0, _StGuidGet, "StGuidGet");
    public static final int _ChannelList = 24593;
    public static final QQVideoJCECmd ChannelList = new QQVideoJCECmd(1, _ChannelList, "ChannelList");
    public static final int _FeedList = 24608;
    public static final QQVideoJCECmd FeedList = new QQVideoJCECmd(2, _FeedList, "FeedList");
    public static final int _FeedListiPad = 25316;
    public static final QQVideoJCECmd FeedListiPad = new QQVideoJCECmd(3, _FeedListiPad, "FeedListiPad");
    public static final int _SearchSmart = 24733;
    public static final QQVideoJCECmd SearchSmart = new QQVideoJCECmd(4, _SearchSmart, "SearchSmart");
    public static final int _VideoDetails = 24805;
    public static final QQVideoJCECmd VideoDetails = new QQVideoJCECmd(5, _VideoDetails, "VideoDetails");
    public static final int _DetailVideoList = 24806;
    public static final QQVideoJCECmd DetailVideoList = new QQVideoJCECmd(6, _DetailVideoList, "DetailVideoList");
    public static final int _DetailCoverList = 24807;
    public static final QQVideoJCECmd DetailCoverList = new QQVideoJCECmd(7, _DetailCoverList, "DetailCoverList");
    public static final int _SecondaryFeedList = 65231;
    public static final QQVideoJCECmd SecondaryFeedList = new QQVideoJCECmd(8, _SecondaryFeedList, "SecondaryFeedList");
    public static final int _GetCloudBucketConfig = 24842;
    public static final QQVideoJCECmd GetCloudBucketConfig = new QQVideoJCECmd(9, _GetCloudBucketConfig, "GetCloudBucketConfig");
    public static final QQVideoJCECmd NewRefreshToken = new QQVideoJCECmd(10, 59987, "NewRefreshToken");
    public static final QQVideoJCECmd NewLogin = new QQVideoJCECmd(11, 59986, "NewLogin");
    public static final QQVideoJCECmd NewLogout = new QQVideoJCECmd(12, 59988, "NewLogout");
    public static final QQVideoJCECmd NewGetTicket = new QQVideoJCECmd(13, 60788, "NewGetTicket");
    public static final int _AppUpdate = 24841;
    public static final QQVideoJCECmd AppUpdate = new QQVideoJCECmd(14, _AppUpdate, "AppUpdate");
    public static final int _WatchRecordListV1 = 24811;
    public static final QQVideoJCECmd WatchRecordListV1 = new QQVideoJCECmd(15, _WatchRecordListV1, "WatchRecordListV1");
    public static final int _WatchRecordUploadV1 = 24810;
    public static final QQVideoJCECmd WatchRecordUploadV1 = new QQVideoJCECmd(16, _WatchRecordUploadV1, "WatchRecordUploadV1");
    public static final int _WatchRecordPostersV1 = 24813;
    public static final QQVideoJCECmd WatchRecordPostersV1 = new QQVideoJCECmd(17, _WatchRecordPostersV1, "WatchRecordPostersV1");
    public static final int _WatchRecordDelV1 = 24812;
    public static final QQVideoJCECmd WatchRecordDelV1 = new QQVideoJCECmd(18, _WatchRecordDelV1, "WatchRecordDelV1");
    public static final int _TicketTrade = 59572;
    public static final QQVideoJCECmd TicketTrade = new QQVideoJCECmd(19, _TicketTrade, "TicketTrade");
    public static final int _AiSeeRsaEncrypt = 23875;
    public static final QQVideoJCECmd AiSeeRsaEncrypt = new QQVideoJCECmd(20, _AiSeeRsaEncrypt, "AiSeeRsaEncrypt");
    public static final int _PriceCloud = 59569;
    public static final QQVideoJCECmd PriceCloud = new QQVideoJCECmd(21, _PriceCloud, "PriceCloud");
    public static final int _SearchRank = 24732;
    public static final QQVideoJCECmd SearchRank = new QQVideoJCECmd(22, _SearchRank, "SearchRank");
    public static final int _SearchHotWords = 24797;
    public static final QQVideoJCECmd SearchHotWords = new QQVideoJCECmd(23, _SearchHotWords, "SearchHotWords");
    public static final int _VideoList = 24902;
    public static final QQVideoJCECmd VideoList = new QQVideoJCECmd(24, _VideoList, "VideoList");
    public static final int _Search = 24731;
    public static final QQVideoJCECmd Search = new QQVideoJCECmd(25, _Search, "Search");
    public static final int _CheckDownloadCopyright = 59985;
    public static final QQVideoJCECmd CheckDownloadCopyright = new QQVideoJCECmd(26, _CheckDownloadCopyright, "CheckDownloadCopyright");
    public static final int _GetCacheList = 24002;
    public static final QQVideoJCECmd GetCacheList = new QQVideoJCECmd(27, _GetCacheList, "GetCacheList");
    public static final int _AccountPlayPermission = 24194;
    public static final QQVideoJCECmd AccountPlayPermission = new QQVideoJCECmd(28, _AccountPlayPermission, "AccountPlayPermission");
    public static final int _OneWeekSignUp = 24369;
    public static final QQVideoJCECmd OneWeekSignUp = new QQVideoJCECmd(29, _OneWeekSignUp, "OneWeekSignUp");
    public static final int _FollowAction = 24824;
    public static final QQVideoJCECmd FollowAction = new QQVideoJCECmd(30, _FollowAction, "FollowAction");
    public static final int _MyFollow = 24827;
    public static final QQVideoJCECmd MyFollow = new QQVideoJCECmd(31, _MyFollow, "MyFollow");
    public static final int _MyAllFollow = 24828;
    public static final QQVideoJCECmd MyAllFollow = new QQVideoJCECmd(32, _MyAllFollow, "MyAllFollow");
    public static final int _OperatePageNav = 24666;
    public static final QQVideoJCECmd OperatePageNav = new QQVideoJCECmd(33, _OperatePageNav, "OperatePageNav");
    public static final int _OperatePageNavIPad = 25318;
    public static final QQVideoJCECmd OperatePageNavIPad = new QQVideoJCECmd(34, _OperatePageNavIPad, "OperatePageNavIPad");
    public static final int _OperationPageList = 24648;
    public static final QQVideoJCECmd OperationPageList = new QQVideoJCECmd(35, _OperationPageList, "OperationPageList");
    public static final int _OperationPageListIPad = 25338;
    public static final QQVideoJCECmd OperationPageListIPad = new QQVideoJCECmd(36, _OperationPageListIPad, "OperationPageListIPad");
    public static final int _LiveDetail = 24873;
    public static final QQVideoJCECmd LiveDetail = new QQVideoJCECmd(37, _LiveDetail, "LiveDetail");
    public static final int _LiveDetailIPad = 25356;
    public static final QQVideoJCECmd LiveDetailIPad = new QQVideoJCECmd(38, _LiveDetailIPad, "LiveDetailIPad");
    public static final int _LivePoll = 24874;
    public static final QQVideoJCECmd LivePoll = new QQVideoJCECmd(39, _LivePoll, "LivePoll");
    public static final int _LivePollIPad = 25355;
    public static final QQVideoJCECmd LivePollIPad = new QQVideoJCECmd(40, _LivePollIPad, "LivePollIPad");
    public static final int _LiveMultiCameraInfo = 24875;
    public static final QQVideoJCECmd LiveMultiCameraInfo = new QQVideoJCECmd(41, _LiveMultiCameraInfo, "LiveMultiCameraInfo");
    public static final int _LiveMultiCameraInfoIPad = 25354;
    public static final QQVideoJCECmd LiveMultiCameraInfoIPad = new QQVideoJCECmd(42, _LiveMultiCameraInfoIPad, "LiveMultiCameraInfoIPad");
    public static final int _FollowActorPage = 24761;
    public static final QQVideoJCECmd FollowActorPage = new QQVideoJCECmd(43, _FollowActorPage, "FollowActorPage");
    public static final int _BookAction = 24788;
    public static final QQVideoJCECmd BookAction = new QQVideoJCECmd(44, _BookAction, "BookAction");
    public static final int _ReportPlayStart = 24702;
    public static final QQVideoJCECmd ReportPlayStart = new QQVideoJCECmd(45, _ReportPlayStart, "ReportPlayStart");
    public static final int _ReportPlayStop = 24703;
    public static final QQVideoJCECmd ReportPlayStop = new QQVideoJCECmd(46, _ReportPlayStop, "ReportPlayStop");
    public static final int _AccountUserInfo = 24802;
    public static final QQVideoJCECmd AccountUserInfo = new QQVideoJCECmd(47, _AccountUserInfo, "AccountUserInfo");
    public static final int _SearchVideoList = 24764;
    public static final QQVideoJCECmd SearchVideoList = new QQVideoJCECmd(48, _SearchVideoList, "SearchVideoList");
    public static final int _LikeAction = 24803;
    public static final QQVideoJCECmd LikeAction = new QQVideoJCECmd(49, _LikeAction, "LikeAction");
    public static final QQVideoJCECmd BindCellphone = new QQVideoJCECmd(50, 24736, "BindCellphone");
    public static final QQVideoJCECmd CheckBindReadForward = new QQVideoJCECmd(51, 24869, "CheckBindReadForward");
    public static final QQVideoJCECmd CheckBindReadReverse = new QQVideoJCECmd(52, 24870, "CheckBindReadReverse");
    public static final QQVideoJCECmd CheckCode = new QQVideoJCECmd(53, 24681, "CheckCode");
    public static final QQVideoJCECmd GetCode = new QQVideoJCECmd(54, 24680, "GetCode");
    public static final int _LikeGlobalSwitch = 24830;
    public static final QQVideoJCECmd LikeGlobalSwitch = new QQVideoJCECmd(55, _LikeGlobalSwitch, "LikeGlobalSwitch");
    public static final int _CommentGlobalSwitch = 24852;
    public static final QQVideoJCECmd CommentGlobalSwitch = new QQVideoJCECmd(56, _CommentGlobalSwitch, "CommentGlobalSwitch");
    public static final int _ShareGlobalSwitch = 24851;
    public static final QQVideoJCECmd ShareGlobalSwitch = new QQVideoJCECmd(57, _ShareGlobalSwitch, "ShareGlobalSwitch");
    public static final int _PublishLiveComment = 24814;
    public static final QQVideoJCECmd PublishLiveComment = new QQVideoJCECmd(58, _PublishLiveComment, "PublishLiveComment");
    public static final int _PublishVideoComment = 24815;
    public static final QQVideoJCECmd PublishVideoComment = new QQVideoJCECmd(59, _PublishVideoComment, "PublishVideoComment");
    public static final int _LiveCommentList = 24816;
    public static final QQVideoJCECmd LiveCommentList = new QQVideoJCECmd(60, _LiveCommentList, "LiveCommentList");
    public static final int _VideoCommentList = 24817;
    public static final QQVideoJCECmd VideoCommentList = new QQVideoJCECmd(61, _VideoCommentList, "VideoCommentList");
    public static final int _MyCommentList = 24818;
    public static final QQVideoJCECmd MyCommentList = new QQVideoJCECmd(62, _MyCommentList, "MyCommentList");
    public static final int _CommentDelete = 24821;
    public static final QQVideoJCECmd CommentDelete = new QQVideoJCECmd(63, _CommentDelete, "CommentDelete");
    public static final int _CommentCount = 24819;
    public static final QQVideoJCECmd CommentCount = new QQVideoJCECmd(64, _CommentCount, "CommentCount");
    public static final int _FavoriteAction = 24796;
    public static final QQVideoJCECmd FavoriteAction = new QQVideoJCECmd(65, _FavoriteAction, "FavoriteAction");
    public static final int _FavoriteIDList = 24845;
    public static final QQVideoJCECmd FavoriteIDList = new QQVideoJCECmd(66, _FavoriteIDList, "FavoriteIDList");
    public static final int _ShareAction = 24853;
    public static final QQVideoJCECmd ShareAction = new QQVideoJCECmd(67, _ShareAction, "ShareAction");
    public static final int _DynamicInsertFeed = 24883;
    public static final QQVideoJCECmd DynamicInsertFeed = new QQVideoJCECmd(68, _DynamicInsertFeed, "DynamicInsertFeed");
    public static final int _GetAppStartUpPictureConfig = 24896;
    public static final QQVideoJCECmd GetAppStartUpPictureConfig = new QQVideoJCECmd(69, _GetAppStartUpPictureConfig, "GetAppStartUpPictureConfig");
    public static final int _TVTimeShiftProgram = 24897;
    public static final QQVideoJCECmd TVTimeShiftProgram = new QQVideoJCECmd(70, _TVTimeShiftProgram, "TVTimeShiftProgram");
    public static final int _DevReport = 24901;
    public static final QQVideoJCECmd DevReport = new QQVideoJCECmd(71, _DevReport, "DevReport");
    public static final int _CPRec = 24838;
    public static final QQVideoJCECmd CPRec = new QQVideoJCECmd(72, _CPRec, "CPRec");
    public static final int _WebGetCode = 24960;
    public static final QQVideoJCECmd WebGetCode = new QQVideoJCECmd(73, _WebGetCode, "WebGetCode");
    public static final int _HoverBallConfig = 24961;
    public static final QQVideoJCECmd HoverBallConfig = new QQVideoJCECmd(74, _HoverBallConfig, "HoverBallConfig");
    public static final int _SignInConfig = 24963;
    public static final QQVideoJCECmd SignInConfig = new QQVideoJCECmd(75, _SignInConfig, "SignInConfig");
    public static final int _GetTmpCredentials = 24854;
    public static final QQVideoJCECmd GetTmpCredentials = new QQVideoJCECmd(76, _GetTmpCredentials, "GetTmpCredentials");
    public static final int _VideoReplyCommentList = 24965;
    public static final QQVideoJCECmd VideoReplyCommentList = new QQVideoJCECmd(77, _VideoReplyCommentList, "VideoReplyCommentList");
    public static final int _JumpVideoCommentList = 24966;
    public static final QQVideoJCECmd JumpVideoCommentList = new QQVideoJCECmd(78, _JumpVideoCommentList, "JumpVideoCommentList");
    public static final int _VideoCommentLike = 24967;
    public static final QQVideoJCECmd VideoCommentLike = new QQVideoJCECmd(79, _VideoCommentLike, "VideoCommentLike");
    public static final int _PublishVideoReplyComment = 24968;
    public static final QQVideoJCECmd PublishVideoReplyComment = new QQVideoJCECmd(80, _PublishVideoReplyComment, "PublishVideoReplyComment");
    public static final int _MyReplyCommentList = 24969;
    public static final QQVideoJCECmd MyReplyCommentList = new QQVideoJCECmd(81, _MyReplyCommentList, "MyReplyCommentList");
    public static final int _ReplyCommentCount = 24970;
    public static final QQVideoJCECmd ReplyCommentCount = new QQVideoJCECmd(82, _ReplyCommentCount, "ReplyCommentCount");
    public static final int _ModifyUser = 24964;
    public static final QQVideoJCECmd ModifyUser = new QQVideoJCECmd(83, _ModifyUser, "ModifyUser");
    public static final int _DetailPagePlayBasic = 24976;
    public static final QQVideoJCECmd DetailPagePlayBasic = new QQVideoJCECmd(84, _DetailPagePlayBasic, "DetailPagePlayBasic");
    public static final int _GetVodUploadSignature = 24979;
    public static final QQVideoJCECmd GetVodUploadSignature = new QQVideoJCECmd(85, _GetVodUploadSignature, "GetVodUploadSignature");
    public static final int _VodUploadComplete = 25033;
    public static final QQVideoJCECmd VodUploadComplete = new QQVideoJCECmd(86, _VodUploadComplete, "VodUploadComplete");
    public static final int _GetGShootTopics = 24980;
    public static final QQVideoJCECmd GetGShootTopics = new QQVideoJCECmd(87, _GetGShootTopics, "GetGShootTopics");
    public static final int _GetActivityEntranceConfigList = 24981;
    public static final QQVideoJCECmd GetActivityEntranceConfigList = new QQVideoJCECmd(88, _GetActivityEntranceConfigList, "GetActivityEntranceConfigList");
    public static final int _GetHomeTabWelfareEntryAction = 24984;
    public static final QQVideoJCECmd GetHomeTabWelfareEntryAction = new QQVideoJCECmd(89, _GetHomeTabWelfareEntryAction, "GetHomeTabWelfareEntryAction");
    public static final int _AppStartupConfig = 24990;
    public static final QQVideoJCECmd AppStartupConfig = new QQVideoJCECmd(90, _AppStartupConfig, "AppStartupConfig");
    public static final int _TVShowList = 24997;
    public static final QQVideoJCECmd TVShowList = new QQVideoJCECmd(91, _TVShowList, "TVShowList");
    public static final int _TabHoverBallConfig = 25006;
    public static final QQVideoJCECmd TabHoverBallConfig = new QQVideoJCECmd(92, _TabHoverBallConfig, "TabHoverBallConfig");
    public static final int _CPClassificationList = 25007;
    public static final QQVideoJCECmd CPClassificationList = new QQVideoJCECmd(93, _CPClassificationList, "CPClassificationList");
    public static final int _FollowActorTabPage = 25008;
    public static final QQVideoJCECmd FollowActorTabPage = new QQVideoJCECmd(94, _FollowActorTabPage, "FollowActorTabPage");
    public static final int _CPVideoList = 25018;
    public static final QQVideoJCECmd CPVideoList = new QQVideoJCECmd(95, _CPVideoList, "CPVideoList");
    public static final int _RedDotConfig = 25019;
    public static final QQVideoJCECmd RedDotConfig = new QQVideoJCECmd(96, _RedDotConfig, "RedDotConfig");
    public static final int _LiveExt = 25025;
    public static final QQVideoJCECmd LiveExt = new QQVideoJCECmd(97, _LiveExt, "LiveExt");
    public static final int _LiveExtIPad = 25353;
    public static final QQVideoJCECmd LiveExtIPad = new QQVideoJCECmd(98, _LiveExtIPad, "LiveExtIPad");
    public static final int _TopicList = 25030;
    public static final QQVideoJCECmd TopicList = new QQVideoJCECmd(99, _TopicList, "TopicList");
    public static final int _UserVideoList = 25031;
    public static final QQVideoJCECmd UserVideoList = new QQVideoJCECmd(100, _UserVideoList, "UserVideoList");
    public static final int _UcenterCfg = 25049;
    public static final QQVideoJCECmd UcenterCfg = new QQVideoJCECmd(101, _UcenterCfg, "UcenterCfg");
    public static final int _TaskComplete = 25042;
    public static final QQVideoJCECmd TaskComplete = new QQVideoJCECmd(102, _TaskComplete, "TaskComplete");
    public static final int _TaskList = 25043;
    public static final QQVideoJCECmd TaskList = new QQVideoJCECmd(103, _TaskList, "TaskList");
    public static final int _H5SkipConfig = 25047;
    public static final QQVideoJCECmd H5SkipConfig = new QQVideoJCECmd(104, _H5SkipConfig, "H5SkipConfig");
    public static final int _TaskListWithAuth = 25048;
    public static final QQVideoJCECmd TaskListWithAuth = new QQVideoJCECmd(105, _TaskListWithAuth, "TaskListWithAuth");
    public static final int _GetCpInfo = 25060;
    public static final QQVideoJCECmd GetCpInfo = new QQVideoJCECmd(106, _GetCpInfo, "GetCpInfo");
    public static final int _PortraitVideoList = 25065;
    public static final QQVideoJCECmd PortraitVideoList = new QQVideoJCECmd(107, _PortraitVideoList, "PortraitVideoList");
    public static final int _PortraitVideoListIPad = 25359;
    public static final QQVideoJCECmd PortraitVideoListIPad = new QQVideoJCECmd(108, _PortraitVideoListIPad, "PortraitVideoListIPad");
    public static final int _HomeRedDotConfig = 25063;
    public static final QQVideoJCECmd HomeRedDotConfig = new QQVideoJCECmd(109, _HomeRedDotConfig, "HomeRedDotConfig");
    public static final int _EraseHomeRedDot = 25068;
    public static final QQVideoJCECmd EraseHomeRedDot = new QQVideoJCECmd(110, _EraseHomeRedDot, "EraseHomeRedDot");
    public static final int _LiveHistoryCommentList = 25062;
    public static final QQVideoJCECmd LiveHistoryCommentList = new QQVideoJCECmd(111, _LiveHistoryCommentList, "LiveHistoryCommentList");
    public static final int _MsgList = 25072;
    public static final QQVideoJCECmd MsgList = new QQVideoJCECmd(112, _MsgList, "MsgList");
    public static final int _MsgPoll = 25073;
    public static final QQVideoJCECmd MsgPoll = new QQVideoJCECmd(113, _MsgPoll, "MsgPoll");
    public static final int _LikeList = 25093;
    public static final QQVideoJCECmd LikeList = new QQVideoJCECmd(114, _LikeList, "LikeList");
    public static final int _InteractiveMsgList = 25098;
    public static final QQVideoJCECmd InteractiveMsgList = new QQVideoJCECmd(115, _InteractiveMsgList, "InteractiveMsgList");
    public static final int _CommunityFeedList = 25107;
    public static final QQVideoJCECmd CommunityFeedList = new QQVideoJCECmd(116, _CommunityFeedList, "CommunityFeedList");
    public static final int _CircleAction = 25110;
    public static final QQVideoJCECmd CircleAction = new QQVideoJCECmd(117, _CircleAction, "CircleAction");
    public static final int _CircleHomePage = 25111;
    public static final QQVideoJCECmd CircleHomePage = new QQVideoJCECmd(118, _CircleHomePage, "CircleHomePage");
    public static final int _DeletePost = 25115;
    public static final QQVideoJCECmd DeletePost = new QQVideoJCECmd(119, _DeletePost, "DeletePost");
    public static final int _MyCircleList = 25113;
    public static final QQVideoJCECmd MyCircleList = new QQVideoJCECmd(120, _MyCircleList, "MyCircleList");
    public static final int _AllMyCircleList = 25116;
    public static final QQVideoJCECmd AllMyCircleList = new QQVideoJCECmd(121, _AllMyCircleList, "AllMyCircleList");
    public static final int _CommunityPersonHomePage = 25106;
    public static final QQVideoJCECmd CommunityPersonHomePage = new QQVideoJCECmd(122, _CommunityPersonHomePage, "CommunityPersonHomePage");
    public static final int _CreatePost = 25112;
    public static final QQVideoJCECmd CreatePost = new QQVideoJCECmd(123, _CreatePost, "CreatePost");
    public static final int _ForwardPost = 25119;
    public static final QQVideoJCECmd ForwardPost = new QQVideoJCECmd(124, _ForwardPost, "ForwardPost");
    public static final int _ReportPost = 25121;
    public static final QQVideoJCECmd ReportPost = new QQVideoJCECmd(125, _ReportPost, "ReportPost");
    public static final int _AllCircleList = 25123;
    public static final QQVideoJCECmd AllCircleList = new QQVideoJCECmd(126, _AllCircleList, "AllCircleList");
    public static final int _ModifyUserInfo = 25127;
    public static final QQVideoJCECmd ModifyUserInfo = new QQVideoJCECmd(127, _ModifyUserInfo, "ModifyUserInfo");
    public static final int _CommunityFollowingList = 25102;
    public static final QQVideoJCECmd CommunityFollowingList = new QQVideoJCECmd(128, _CommunityFollowingList, "CommunityFollowingList");
    public static final int _GetPostInfo = 25122;
    public static final QQVideoJCECmd GetPostInfo = new QQVideoJCECmd(129, _GetPostInfo, "GetPostInfo");
    public static final int _CommunityMuteInfo = 25130;
    public static final QQVideoJCECmd CommunityMuteInfo = new QQVideoJCECmd(130, _CommunityMuteInfo, "CommunityMuteInfo");
    public static final int _PostDetail = 25143;
    public static final QQVideoJCECmd PostDetail = new QQVideoJCECmd(131, _PostDetail, "PostDetail");
    public static final int _PostDetailIPad = 25360;
    public static final QQVideoJCECmd PostDetailIPad = new QQVideoJCECmd(132, _PostDetailIPad, "PostDetailIPad");
    public static final int _MomentCommentList = 25153;
    public static final QQVideoJCECmd MomentCommentList = new QQVideoJCECmd(133, _MomentCommentList, "MomentCommentList");
    public static final int _AppBottomTabBubble = 25159;
    public static final QQVideoJCECmd AppBottomTabBubble = new QQVideoJCECmd(134, _AppBottomTabBubble, "AppBottomTabBubble");
    public static final int _PayOrder = 25164;
    public static final QQVideoJCECmd PayOrder = new QQVideoJCECmd(135, _PayOrder, "PayOrder");
    public static final int _GuidVipRequest = 25200;
    public static final QQVideoJCECmd GuidVipRequest = new QQVideoJCECmd(136, _GuidVipRequest, "GuidVipRequest");
    public static final int _CircleUserList = 25239;
    public static final QQVideoJCECmd CircleUserList = new QQVideoJCECmd(137, _CircleUserList, "CircleUserList");
    public static final int _CacheVideoList = 25240;
    public static final QQVideoJCECmd CacheVideoList = new QQVideoJCECmd(138, _CacheVideoList, "CacheVideoList");
    public static final int _CachedVideoInfo = 25241;
    public static final QQVideoJCECmd CachedVideoInfo = new QQVideoJCECmd(139, _CachedVideoInfo, "CachedVideoInfo");
    public static final int _PersonalConf = 25265;
    public static final QQVideoJCECmd PersonalConf = new QQVideoJCECmd(140, _PersonalConf, "PersonalConf");
    public static final int _PersonalConfFix = 25263;
    public static final QQVideoJCECmd PersonalConfFix = new QQVideoJCECmd(141, _PersonalConfFix, "PersonalConfFix");
    public static final int _PhoneBind = 25267;
    public static final QQVideoJCECmd PhoneBind = new QQVideoJCECmd(142, _PhoneBind, "PhoneBind");
    public static final int _ScreenLiveList = 25282;
    public static final QQVideoJCECmd ScreenLiveList = new QQVideoJCECmd(143, _ScreenLiveList, "ScreenLiveList");
    public static final int _ScreenLiveListIPad = 25352;
    public static final QQVideoJCECmd ScreenLiveListIPad = new QQVideoJCECmd(144, _ScreenLiveListIPad, "ScreenLiveListIPad");
    public static final int _IsScreenHasLiveList = 25285;
    public static final QQVideoJCECmd IsScreenHasLiveList = new QQVideoJCECmd(145, _IsScreenHasLiveList, "IsScreenHasLiveList");
    public static final int _IsScreenHasLiveListIPad = 25351;
    public static final QQVideoJCECmd IsScreenHasLiveListIPad = new QQVideoJCECmd(146, _IsScreenHasLiveListIPad, "IsScreenHasLiveListIPad");
    public static final int _MatchFilter = 25311;
    public static final QQVideoJCECmd MatchFilter = new QQVideoJCECmd(147, _MatchFilter, "MatchFilter");
    public static final int _PidTimeShift = 25312;
    public static final QQVideoJCECmd PidTimeShift = new QQVideoJCECmd(148, _PidTimeShift, "PidTimeShift");
    public static final int _PidEditTask = 25313;
    public static final QQVideoJCECmd PidEditTask = new QQVideoJCECmd(149, _PidEditTask, "PidEditTask");
    public static final int _PidQueryTask = 25314;
    public static final QQVideoJCECmd PidQueryTask = new QQVideoJCECmd(150, _PidQueryTask, "PidQueryTask");
    public static final int _CheckUserVipBind = 25272;
    public static final QQVideoJCECmd CheckUserVipBind = new QQVideoJCECmd(151, _CheckUserVipBind, "CheckUserVipBind");
    public static final int _UninterestedReport = 25324;
    public static final QQVideoJCECmd UninterestedReport = new QQVideoJCECmd(152, _UninterestedReport, "UninterestedReport");
    public static final int _UninterestedReportDup = 25317;
    public static final QQVideoJCECmd UninterestedReportDup = new QQVideoJCECmd(153, _UninterestedReportDup, "UninterestedReportDup");
    public static final int _GameList = 25309;
    public static final QQVideoJCECmd GameList = new QQVideoJCECmd(154, _GameList, "GameList");
    public static final int _GameNum = 25310;
    public static final QQVideoJCECmd GameNum = new QQVideoJCECmd(155, _GameNum, "GameNum");
    public static final int _GameCenterTab = 25315;
    public static final QQVideoJCECmd GameCenterTab = new QQVideoJCECmd(156, _GameCenterTab, "GameCenterTab");
    public static final int _GameMatchTab = 25369;
    public static final QQVideoJCECmd GameMatchTab = new QQVideoJCECmd(157, _GameMatchTab, "GameMatchTab");
    public static final int _SubscribeGameList = 25319;
    public static final QQVideoJCECmd SubscribeGameList = new QQVideoJCECmd(158, _SubscribeGameList, "SubscribeGameList");
    public static final int _GameIDsToSubscribe = 25323;
    public static final QQVideoJCECmd GameIDsToSubscribe = new QQVideoJCECmd(159, _GameIDsToSubscribe, "GameIDsToSubscribe");
    public static final int _BatchSubscribeAPP = 25325;
    public static final QQVideoJCECmd BatchSubscribeAPP = new QQVideoJCECmd(160, _BatchSubscribeAPP, "BatchSubscribeAPP");
    public static final int _ChannelsWithPrograms = 25328;
    public static final QQVideoJCECmd ChannelsWithPrograms = new QQVideoJCECmd(161, _ChannelsWithPrograms, "ChannelsWithPrograms");
    public static final int _SubscribedPids = 24809;
    public static final QQVideoJCECmd SubscribedPids = new QQVideoJCECmd(162, _SubscribedPids, "SubscribedPids");
    public static final int _CheckVideoEpisodes = 25331;
    public static final QQVideoJCECmd CheckVideoEpisodes = new QQVideoJCECmd(163, _CheckVideoEpisodes, "CheckVideoEpisodes");
    public static final int _ProgramsList = 25333;
    public static final QQVideoJCECmd ProgramsList = new QQVideoJCECmd(164, _ProgramsList, "ProgramsList");
    public static final int _GetCircleInfo = 25337;
    public static final QQVideoJCECmd GetCircleInfo = new QQVideoJCECmd(165, _GetCircleInfo, "GetCircleInfo");
    public static final int _FeedsLiveComment = 25332;
    public static final QQVideoJCECmd FeedsLiveComment = new QQVideoJCECmd(166, _FeedsLiveComment, "FeedsLiveComment");
    public static final int _IPadCPClassificationList = 25349;
    public static final QQVideoJCECmd IPadCPClassificationList = new QQVideoJCECmd(167, _IPadCPClassificationList, "IPadCPClassificationList");
    public static final int _IPadFollowActorTabPage = 25348;
    public static final QQVideoJCECmd IPadFollowActorTabPage = new QQVideoJCECmd(168, _IPadFollowActorTabPage, "IPadFollowActorTabPage");
    public static final int _VideoDetailsIPad = 25346;
    public static final QQVideoJCECmd VideoDetailsIPad = new QQVideoJCECmd(169, _VideoDetailsIPad, "VideoDetailsIPad");
    public static final int _GetTicketSignature = 25306;
    public static final QQVideoJCECmd GetTicketSignature = new QQVideoJCECmd(170, _GetTicketSignature, "GetTicketSignature");
    public static final int _LoginNotice = 25367;
    public static final QQVideoJCECmd LoginNotice = new QQVideoJCECmd(171, _LoginNotice, "LoginNotice");
    public static final int _VidEditTask = 25374;
    public static final QQVideoJCECmd VidEditTask = new QQVideoJCECmd(172, _VidEditTask, "VidEditTask");
    public static final int _TVCircleCardList = 25382;
    public static final QQVideoJCECmd TVCircleCardList = new QQVideoJCECmd(173, _TVCircleCardList, "TVCircleCardList");
    public static final int _LiveMsgRead = 25404;
    public static final QQVideoJCECmd LiveMsgRead = new QQVideoJCECmd(174, _LiveMsgRead, "LiveMsgRead");
    public static final int _FifaVideoList = 25413;
    public static final QQVideoJCECmd FifaVideoList = new QQVideoJCECmd(175, _FifaVideoList, "FifaVideoList");
    public static final int _Topic = 25419;
    public static final QQVideoJCECmd Topic = new QQVideoJCECmd(176, _Topic, "Topic");
    public static final int _SubscribeConf = 25427;
    public static final QQVideoJCECmd SubscribeConf = new QQVideoJCECmd(177, _SubscribeConf, "SubscribeConf");
    public static final int _PortraitLiveList = 25454;
    public static final QQVideoJCECmd PortraitLiveList = new QQVideoJCECmd(178, _PortraitLiveList, "PortraitLiveList");
    public static final int _FoldingScreenHoverCard = 25456;
    public static final QQVideoJCECmd FoldingScreenHoverCard = new QQVideoJCECmd(179, _FoldingScreenHoverCard, "FoldingScreenHoverCard");
    public static final int _TVTimeShiftProgramAuthority = 25457;
    public static final QQVideoJCECmd TVTimeShiftProgramAuthority = new QQVideoJCECmd(180, _TVTimeShiftProgramAuthority, "TVTimeShiftProgramAuthority");
    public static final int _SnapshotCreate = 25471;
    public static final QQVideoJCECmd SnapshotCreate = new QQVideoJCECmd(181, _SnapshotCreate, "SnapshotCreate");
    public static final int _SnapshotDel = 25473;
    public static final QQVideoJCECmd SnapshotDel = new QQVideoJCECmd(182, _SnapshotDel, "SnapshotDel");
    public static final int _SnapshotActList = 25477;
    public static final QQVideoJCECmd SnapshotActList = new QQVideoJCECmd(183, _SnapshotActList, "SnapshotActList");
    public static final int _ModulePage = 25481;
    public static final QQVideoJCECmd ModulePage = new QQVideoJCECmd(184, _ModulePage, "ModulePage");
    public static final int _GetSnapshotDetail = 25479;
    public static final QQVideoJCECmd GetSnapshotDetail = new QQVideoJCECmd(185, _GetSnapshotDetail, "GetSnapshotDetail");
    public static final int _SnapshotPostInfo = 25482;
    public static final QQVideoJCECmd SnapshotPostInfo = new QQVideoJCECmd(186, _SnapshotPostInfo, "SnapshotPostInfo");
    public static final int _ActivityHomePage = 25483;
    public static final QQVideoJCECmd ActivityHomePage = new QQVideoJCECmd(187, _ActivityHomePage, "ActivityHomePage");
    public static final int _GetWSAuthCode = 25464;
    public static final QQVideoJCECmd GetWSAuthCode = new QQVideoJCECmd(188, _GetWSAuthCode, "GetWSAuthCode");
    public static final int _WsPollingMsg = 25493;
    public static final QQVideoJCECmd WsPollingMsg = new QQVideoJCECmd(189, _WsPollingMsg, "WsPollingMsg");
    public static final int _MedalStatistics = 25495;
    public static final QQVideoJCECmd MedalStatistics = new QQVideoJCECmd(190, _MedalStatistics, "MedalStatistics");
    public static final int _MedalChangeSubscription = 25496;
    public static final QQVideoJCECmd MedalChangeSubscription = new QQVideoJCECmd(191, _MedalChangeSubscription, "MedalChangeSubscription");
    public static final int _MedalDetails = 25498;
    public static final QQVideoJCECmd MedalDetails = new QQVideoJCECmd(192, _MedalDetails, "MedalDetails");
    public static final int _GetScheme = 25504;
    public static final QQVideoJCECmd GetScheme = new QQVideoJCECmd(193, _GetScheme, "GetScheme");
    public static final int _SubGameList = 25502;
    public static final QQVideoJCECmd SubGameList = new QQVideoJCECmd(194, _SubGameList, "SubGameList");

    private QQVideoJCECmd(int i2, int i3, String str) {
        this.__T = new String();
        this.__T = str;
        this.__value = i3;
        __values[i2] = this;
    }

    public static QQVideoJCECmd convert(int i2) {
        int i3 = 0;
        while (true) {
            QQVideoJCECmd[] qQVideoJCECmdArr = __values;
            if (i3 >= qQVideoJCECmdArr.length) {
                return null;
            }
            if (qQVideoJCECmdArr[i3].value() == i2) {
                return __values[i3];
            }
            i3++;
        }
    }

    public String toString() {
        return this.__T;
    }

    public int value() {
        return this.__value;
    }

    public static QQVideoJCECmd convert(String str) {
        int i2 = 0;
        while (true) {
            QQVideoJCECmd[] qQVideoJCECmdArr = __values;
            if (i2 >= qQVideoJCECmdArr.length) {
                return null;
            }
            if (qQVideoJCECmdArr[i2].toString().equals(str)) {
                return __values[i2];
            }
            i2++;
        }
    }
}
